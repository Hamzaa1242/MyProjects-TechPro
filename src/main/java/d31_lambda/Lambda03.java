package d31_lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        // int sum = getSumFromSevenToSeventy();
        // System.out.println(sum); // 2464
        // System.out.println(getSumFromSevenToSeventy()); // 2464

        // System.out.println(getMultiplicationFromThreeToNine1()); // 181440
        // System.out.println(getMultiplicationFromThreeToNine2()); // 181440

        // System.out.println(getFactorial(3)); // 6

        // System.out.println(getSumsOfBetweenTwoInteger(5, 12)); // 24

    }

    // 1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    /*
    a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)

    b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
    temsil eden bir akış oluşturur.

    c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
    temsil eden bir akış oluşturur.

    d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.

    e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream
    kullaninca bunu kullaniriz). Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır */

    public static int getSumFromSevenToSeventy(){
        // Integer classtaki sum methodu

        // return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();

        // Ekstra Bilgi :

        OptionalInt result = IntStream.rangeClosed(7, 70).reduce(Math::addExact);

        if (result.isPresent()){
            return result.getAsInt();
        }else {
            throw new RuntimeException("Beklenmedik bir hata oluştu");
        }
        // Integer::sum ile Math::addExact toplama yapar, peki farkları nedir ?
        // 2147483647 + 1 ==> taşma olur > exception fırlatır. Math::addExact taşma kontrolü yapar
    }

    // 2) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz

    // Integer::sum: Taşma kontrolü yapmaz ve int sınırlarını aşan sonuçlar dönebilir.
    // Kullanımı daha basittir ama taşma durumlarında dikkatli olunmalıdır.
    // Math::addExact: Taşma kontrolü yapar ve taşma meydana geldiğinde ArithmeticException fırlatır.
    // Bu, güvenli bir toplama işlemi sağlar ve taşma hatalarını tespit etmeye yardımcı olur.
    // Her iki metod da toplama işlemi yapar, ancak Math::addExact taşma kontrolü yaparak daha güvenli bir yaklaşım
    // sunar.

    // 1. Yol

    public static int getMultiplicationFromThreeToNine1(){
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
    }

    // 2. Yol

    public static int getMultiplicationFromThreeToNine2(){
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();
    }

    // 3) Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.

    // 3! = 1 * 2 * 3 = 6
    // 0! = 1
    // Negatif sayıların faktöriyeli yoktur

    public static int getFactorial(int x){
        if (x == 0){
            return 1;
        } else if (x < 0) {
            System.out.println("Geçersiz data girdiniz");
            return -1;
        }else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
    }

    // 4) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    // baslangic ve bitis dahil degil.

    // sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür.

    public static int getSumsOfBetweenTwoInteger(int a, int b){
        // Yer değiştirme algoritması  a = 12, b = 5

        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();
    }
}

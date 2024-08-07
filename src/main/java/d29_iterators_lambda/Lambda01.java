package d29_iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {

        /*
        Lambda ifadeleri, Java 8 ile birlikte tanıtılan ve fonksiyonel(methodsal) programlamayı
        kolaylaştırmak için kullanılan bir özelliktir.

        Lambda ifadelerinin genel avantajları:
        1- Daha az kod yazma: Lambdalar, daha az ve daha okunabilir kod yazmanızı sağlar.
        2- Fonksiyonel programlama: Java'nın fonksiyonel programlama özelliklerini kullanmanıza yardımcı olur.
        3- İsimsizdir: Lambda ifadeleri, bir isme sahip değildir.(method ismi yoktur)
        4- Tek bir ifade içerebilir: Lambda ifadeleri, bir veya daha fazla işlem gerçekleştiren tek
        bir ifade içerebilir.
        5- Bir veya daha fazla parametre alabilir */

        /*
        Lambda ile neler yapabiliriz?
        1- Fonksiyonel interface'leri kullanabilirsiniz
        2- Kisa fonksiyonlar tanimlayabilirsiniz
        3- Koleksiyonlar uzerinde islem yapabilirsiniz
        4- Metot Refaranslari icin idealdir

        Lambda ile neler yapamazsiniz?
        1- Checked exception firlatamazsiniz
        2- Karmasik islemleri yapamazsiniz
        */

        /* 1) Lambda Functional Programming'dir, digeri "Structured Programming" dir
        Structured Programming: Yapısal programlama, programların belirli yapılar veya kontrol yapıları
        (örneğin döngüler, şartlı ifadeler) kullanılarak yazılmasını teşvik eden bir programlamadir.

        2) Functional programming, Collection'lar ve Array'ler ile yaygin olarak kullanilir.(Map'lerde direkt
        kullanılmaz entrySet ile Set'e cevrilirse kullanilabilir) */

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));
        // printElements1(nums); // 12 9 131 14 9 10 4 12 15
        // printElements2(nums); // 12 9 131 14 9 10 4 12 15
        // printEvenElements1(nums); // 12 14 10 4 12
        // printEvenElements2(nums); // 12 14 10 4 12

    } // Main Dışı

    // 1) Bir list’teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method’u olusturunuz.(Structured == Yapisal)

    public static void printElements1(List<Integer> nums){
        for (Integer w : nums){
            // System.out.print(w + " ");
        }
    }

    // 2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional)

    // stream() metodu, koleksiyonları bir akışa (stream) dönüştürerek üzerinde işlem yapmayı sağlar.
    // Akışın (stream) adı, verinin bir kaynaktan hedefe doğru “akmasını” ifade eder.

    public static void printElements2(List<Integer> nums){
        nums.stream().forEach(t -> System.out.print(t + " ")); // t değişken adıdır (type'dan gelir)
        // Akıştan gelen her t(degisken adı) için, o t'lerin herbirini yazdir.
    }

    // Örnek 3: Bir List<Integer> içindeki tüm çift sayıları bulun ve bu sayıları aynı satırda, aralarında bir boşluk
    // olacak şekilde konsola yazdıran bir metod yazınız.(Structured)

    public static void printEvenElements1(List<Integer> nums){
        for (Integer w : nums){
            if (w % 2 == 0){
                System.out.print(w + " ");
            }
        }
    }

    // Örnek 4: Bir List<Integer> içindeki tüm çift sayıları bulun ve bu sayıları aynı satırda, aralarında bir boşluk
    // olacak şekilde konsola yazdıran bir metod yazınız.(functional)

    // Stream API'si ile birlikte sıkça kullanılan bazı metodlar şunlardır:
    // 1) filter(): Koşulu karşılayan elemanları filtreler.

    public static void printEvenElements2(List<Integer> nums){
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }
}

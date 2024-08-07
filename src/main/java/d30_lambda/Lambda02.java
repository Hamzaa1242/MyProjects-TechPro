package d30_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10, 14));

        // printSquareOfOddElements(nums); // 9 25 121
        // printCubeOfDistinctOddElements(nums); // 27 125
        // printSumOfSquaresOfDistinctEvenElements(nums); // 104
        // printProductOfSquareOfDistinctEvenElements(nums); // 64

        // max1(nums); // 11
        // max2(nums); // 11
        // max3(nums); // 11
        // max4(nums); // 11

        // min1(nums); // 2
        // min2(nums); // 2
        // min3(nums); // 2
        // min4(nums); // 2
        // min5(nums); // 2

        // getMinGreaterThanSevenEven(nums); // 10

    }

    // ornek 2) Bir tamsayı listesi alan ve listedeki tek sayıların karelerini, aynı satırda, aralarına boşluk koyarak
    // yazdıran bir method oluşturunuz.(Functional)

    // map(): Elemanları dönüştürmek için kullanılır.

    public static void printSquareOfOddElements(List<Integer> nums){
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }

    // --------------------------------------------------------------------------------------------------------------

    // 3) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda, aralarına boşluk koyarak
    // yazdıran bir method oluşturunuz.(Functional)

    // distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir

    public static void printCubeOfDistinctOddElements(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }

    // --------------------------------------------------------------------------------------------------------------

    // 4) Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.

    // Iki sayıyı toplayınca tek bir sonuç elde ederiz. 3 + 5 = 8
    // reduce()azaltmak : Koleksiyon elemanlarını tek bir değere indirger.

    // identity 'ye toplamaya göre etkisiz eleman yazilir. int sum=0; gibi dusunulebilir.
    // Akıstan gelenler u'ya ilk deger ve ara islemler t'ye yuklenir

    // reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
    // t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
    // u: Ilk elemandir
    // (t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

    // İlk iterasyonda:
    // t=0 (başlangıç değeri olarak belirtildiği için)
    // u=4 (ilk eleman)
    // t+u = 4

    // İkinci iterasyonda:
    // t=4 (önceki adımdan gelen sonuç)
    // u=100 (ikinci eleman)
    // t+u = 104

    public static void  printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        int toplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, Integer::sum);
        System.out.println(toplam);
    }

    // 5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){
        int carpim = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1,(t, u) -> t * u);
        System.out.println(carpim);
    }

    // 6) Verilen List’teki maksimum değeri bulmak için bir method oluşturun.

    // Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)

    // 1. Yol

    public static void max1(List<Integer> nums){
        int max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    // 2. Yol

    public static void max2(List<Integer> nums){
        int max = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    // 3. Yol

    public static void max3(List<Integer> nums){
        Integer max = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> u).
                get();
        System.out.println(max);
    }

    // 4. Yol : Best Practice

    public static void max4(List<Integer> nums){
        Integer max = nums.
                stream().
                distinct().
                reduce(Math::max).
                get();
        System.out.println(max);
    }

    // --------------------------------------------------------------------------------------------------------------

    // 7) Verilen List’teki minimum değeri bulmak için bir method oluşturun.

    // 1. Yol

    public static void min1(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> t > u ? u : t).
                get();
        System.out.println(min);
    }

    // 2. Yol

    // sorted(Comparator.reverseOrder()) ifadesi, Java Stream API'si içinde bir koleksiyonu ters sıralamak için
    // kullanılır. Comparator class, reverseOrder() methoddur.

    // sorted -> 2, 3, 4, 5, 10, 11
    // sorted(Comparator.reverseOrder()) -> 11, 10 , 5, 4, 3, 2

    public static void min2(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).
                get();
        System.out.println(min);
    }

    // 3. Yol

    public static void min3(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> t).
                get();
        System.out.println(min);
    }

    // 4. Yol

    public static void min4(List<Integer> nums){
        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> Math.min(t, u)).
                get();
        System.out.println(min);
    }

    // 5. Yol

    public static void min5(List<Integer> nums){
        // Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }

    // --------------------------------------------------------------------------------------------------------------

    // 8) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
    // 2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi

    // findFirst(): Sıralı akışta bulunan ilk elemanı (yani yani bu senaryo da en küçük elemanı) alır.
    // Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
    // (filtreleme nedeniyle veya başka bir sebepten dolayı)

    public static void getMinGreaterThanSevenEven(List<Integer> nums){

        // Integer min = nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().reduce((t, u) -> t).get();

        Integer min = nums.
                stream().
                filter(t -> t > 7 && t % 2 == 0).
                sorted().
                findFirst().
                get();
        System.out.println(min);
    }
}

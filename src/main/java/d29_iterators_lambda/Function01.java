package d29_iterators_lambda;

import java.io.FilterOutputStream;
import java.util.function.Function;

public class Function01 {
    public static void main(String[] args) {

        /*
        Lambda ifadeleri, fonksiyonel arayüzleri (interface) kullanarak daha temiz ve kısa kod yazmanızı sağlar.

        Consumer, Supplier, Function, ve Predicate Java'da fonksiyonel arayüzlerdir (interface).
        Bunlar java.util.function paketi içerisinde tanımlanmış ve her biri yalnızca bir tane soyut metoda
        sahip olan arayüzlerdir. Java'da bir arayüzün fonksiyonel arayüz olarak kabul edilmesi için yalnızca
        bir tane soyut metoda sahip olması gerekmektedir.
        */

        /* Fonksiyonel Arayüzlerin Özellikleri:

        Tek Soyut Metot (abstract): Her fonksiyonel arayüz, tam olarak bir soyut metoda sahiptir.

        Varsayılan ve Statik Metotlar: Fonksiyonel arayüzler, varsayılan (default) ve statik metotlar içerebilir.

        Fonksiyonel Arayüz Örnekleri ve Metotları:

        Function<T, R>: apply(), girdi ve çıktı arasında bir dönüşüm veya işlem gerektiriyorsa kullanilir. Tek bir girdi
        alır ve tek bir çıktı üretir

        Consumer<T>: accept(), Bir girdi alır ve bir işlem gerçekleştirir, ancak herhangi bir çıktı üretmez.

        Supplier<T>: get(), Herhangi bir girdi almadan bir çıktı üretir.

        Predicate<T>: test(), Bir girdiyi alır ve bir koşul testi yapar, sonuç olarak true veya false döndürür.*/

        /*
        Function gibi Java'daki fonksiyonel arayüzler, lambda ifadelerine bir isim ve yapısal bir çerçeve sağlar.
        Bu fonksiyonel arayüzler, lambda ifadelerinin hangi türde parametreler alıp ne türde bir sonuç döndüreceğini
        tanımlar. Böylece, lambda ifadeleri bu arayüzlerin tanımladığı sözleşmeye (contract) uygun şekilde işlev
        görebilir.


        Fonksiyonel arayüzler, lambda ifadeleri için bir çerçeve veya iskelet görevi görür:

        Tür Güvenliği Sağlar: Lambda ifadesinin hangi türde girdileri kabul edeceğini ve hangi türde bir çıktı
        üreteceğini belirler.

        Lambda İfadesinin İmzasını Belirler: Fonksiyonel arayüzler lambda ifadesinin alacağı parametre sayısını ve
        türünü, dönüş türünü ve genel davranışını belirler. Bu, kodun daha okunabilir ve yönetilebilir olmasını sağlar.

        Anonim Sınıfların Yerini Alır: Java 8'den önce, anonim sınıflar genellikle tek metodlu işlevsellik için
        kullanılırdı.

        Lambda ifadeleri ve fonksiyonel arayüzler, bu kullanımı daha temiz ve daha az kodla gerçekleştirmeyi mümkün
        kılar.
         */

        /*
        Function<T, R> fonksiyonel arayüzü;

        T (Type) - Bu, Function arayüzünün girdi parametresinin türünü belirler.
        R (Return veya Result) - Bu, Function arayüzünün çıktısının türünü belirler.

        Function<T, R> Metodları:

        apply(T t) - Bu metod, fonksiyonel arayüzün temel metodudur.
        T türünde bir girdi alır ve R türünde bir çıktı üretir.

        Örnek Kullanım:
        Bir Integer girdisini alıp, onun karesini hesaplayan ve sonucu yine bir Integer
        olarak döndüren bir Function tanımlayalım:

        Function<Integer, Integer> kareAl = x -> x * x;
        Bu örnekte, kareAl isimli bir Function nesnesi oluşturduk:

        T (Integer): Girdi türü olarak Integer belirlendi.
        R (Integer): Çıktı türü olarak Integer belirlendi.
         */

        // 1- Function<T, R> tek bir girdi alır ve tek bir çıktı üretir.
        // Bu nedenle, işleminiz girdi ve çıktı arasında bir dönüşüm veya işlem gerektiriyorsa,
        // Function<T, R> kullanmak uygun olabilir.

        // Ornek 1) Function01 adinda bir class olusturunuz ve icinde bir Lambda fonksiyonu tanimlayarak verilen sayinin
        // karesini aliniz.

        /* Function<Integer, Integer> squaring = x -> {
          int result = x * x;
          return result;
        }; */

        Function<Integer, Integer> squaring = x -> x * x;

        System.out.println("Sonuç : " + squaring.apply(5)); // Sonuç : 25

        // Lambda fonksiyonunu çağıralım

        // int result = squaring.apply(5);
        // System.out.println("Sonuç : " + result); // Sonuç : 25

        // ------------------------------------------------------------------------------------------------------- //

        // Arastirma Odev1: Java da baska fonksiyonel arayuzler de var mi?

        // BiFunction<T,U,R> : İki giriş alır ve bir çıktı döner. Metod: 'R apply(T t, U u)'

        // UnaryOperator<T> : Function<T, T> arayüzünün bir alt türüdür. Bir türden aynı türe dönüştürme işlemleri için
        // kullanılır. Metod: 'T apply(T t)'

        // BinaryOperator<T> : BiFunction<T, T, T> arayüzünün bir alt türüdür. İki aynı türü alır ve aynı türde bir
        // sonuç döner. Metod: 'T apply(T t1, T t2)'

        // Arastirma Odev2: Birden fazla girdi alabilen arayuzler var mi?

        // BiFunction<T,U,R> -- BiConsumer<T,U> -- BinaryOperator<T> -- BiPredicate<T,U>

        // Arastirma Odevi: Fonksiyonel arayuzde, Lambda ifadeleri main method disinda tanimlanabilir mi?
        // Tanimlanabiliyorsa nasil cagirilir?

        /* Evet, lambda ifadeleri Java'da ana metodun dışında da tanımlanabilir ve bu ifadeler daha sonra metodlarda
        çağrılabilir. Lambda ifadeleri bir fonksiyonel arayüz ile tanımlandığı için, bu arayüzün bir örneği olarak
        tanımlanabilir ve gerektiğinde kullanılabilir.

        Lambda İfadelerinin Main Method Dışında Tanımlanması ve Çağrılması

        1- Lambda ifadelerini sınıf seviyesinde tanımlayabilirsiniz.
        2- Lambda ifadelerini örnek değişken olarak tanımlayabilirsiniz.
        3- Lambda ifadelerini statik değişken olarak tanımlayabilirsiniz.
         */
    }
}

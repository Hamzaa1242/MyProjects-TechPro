package d18_datetime_stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        1) "StringBuilder" class'da String ureten bir class'tir.
        2) String class kullanarak String üretiriz, Java nicin StringBuilder'i da olusturdu?
            String class "immutable" (degistirilemez) String uretir,
            StringBuilder class "mutable"(degistirilebilir) String üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
            StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
        5) StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
         ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
        */

        // immutable - değiştirilemez

        String s = "Java"; // Java

        String t = s + "x"; // Javax

        String w = t + "?"; // Javax?

        // StringBuilder b = "Ali"; HATA, "" kullanırsanız Java bunu String kabul eder

        // append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır

        // StringBuilder mutable - değiştirilebilir

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1); // Python

        sb1.append("!");
        System.out.println(sb1); // Python!

        // Peki, bir String’i degistirdikten sonra tekrar ayni String’e yuklersem orjinal deger degismez mi?

        String a = "money";
        System.out.println(a); // money
        a = a + " more";
        System.out.println(a); // money more

        /* 1- String'i degistirdikten sonra ayni String'e assign ederseniz Java yine yeni bir container olusturur.
        2- Degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren
        pointer yeni container'a yonlendirilir
        3- Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"
        adressiz olan container'lari siler. GC bellek sızıntılarını önler.
        GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.
        Veri memory'de sahipsiz ve guvenliksiz bir sekilde beklemez.
        4- GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir
        ve uygulamadan bağımsızdır */

        // capacity() methodu, ayrılmış olan ve henüz kullanılmayan karakter alanının büyüklüğünü ifade eder.
        // Buradaki “karakter” kavramıyla kastedilen şey, Java’daki char veri tipindeki karakterlerdir.
        // char veri tipi, Java’da Unicode karakterleri temsil etmek için kullanılır ve
        // her bir char 2 byte (16-bit) yer kaplar.

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); // 0
        System.out.println(sb2.capacity()); // 16

        // Oluştururken belirli bir kapasite de sağlanabilir

        StringBuilder sb3 = new StringBuilder(50);
        System.out.println(sb3.capacity()); // 50

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); // 4 // 19
        System.out.println(sb2.capacity()); // 16 // 34 (Mevcut olanın 2 katının 2 fazlasını ekler kapasite)

        /*capacity Java'nin size verdigi data depolama yer sayisidir,
        length ise size verilen data depolama yerinin kullanilan kismidir

        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity'i asarsaniz Java yeni capacity'i var olanin 2 katinin 2 fazlasi olacak sekilde
        ayarlar.       16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..*/

        // Default Capacity'yi (16 karakter) nasil degistirebiliriz?

        StringBuilder sb4 = new StringBuilder(3);
        System.out.println(sb4.append("Alis")); // Alis
        System.out.println(sb4.capacity()); // 3 // 8 ==> 3 * 2 + 2 = 8

        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.length()); // 0
        System.out.println(sb5.capacity()); // 16

        sb5.append("Java");
        System.out.println(sb5.length()); // 4
        System.out.println(sb5.capacity()); // 16
    }
}

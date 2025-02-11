package d26_maps_exceptions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps01 {
    public static void main(String[] args) {

        // Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

        /*
        Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
        Veri yarışlarını ve tutarsızlıkları önler.

        Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
        Paralel işleme ve performans artışı sağlar.

        Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
        Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.
        */

        /*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?

        1- HashMap
        a) Thread Safety:
           Thread-safe değildir.
           Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
        b) Multi Thread:
           Tek iş parçacıklı (single-threaded) ortamlar için idealdir.
           Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
        c) Synchronized:
           Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
        d) Null Key/Value:
           Bir null key ve birden fazla null value kabul eder.
        e) Performans:
           En hızlısıdır çünkü synchronized değildir.
         */

        /*
        2- Hashtable
        a) Thread Safety:
           Thread-safe'tir.
           Synchronized yapısı nedeniyle aynı anda sadece bir iş parçacığı tarafından kullanılabilir.
        b) Multi Thread:
           Çok iş parçacıklı (multi-threaded) ortamlar için uygundur.
        c) Synchronized:
           Synchronized'dir, yani tüm metotlar synchronized olarak işaretlenmiştir ve aynı anda sadece bir iş parçacığı
           tarafından erişilebilir.
        d) Null Key/Value:
           Ne null key ne de null value kabul eder. NullPointerException atar.
        e) Performans:
           HashMap'ten daha yavaştır çünkü synchronized'dir ve her erişim için kilitlenir.
        */

        /*
        3- ConcurrentHashMap
        a) Thread Safety:
           Thread-safe'tir.
           Segment-based locking kullanarak senkronizasyon sağlar.
        b) Multi Thread:
           Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.
           Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
        c) Synchronized:
           Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
        d) Null Key/Value:
           Ne null key ne de null value kabul eder. NullPointerException atar.
        e) Performans:
           HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
           Çok iş parçacıklı ortamlar için optimize edilmiştir.

        Not:HashMap, Hashtable ve ConcurrentHashMap'teki entry'ler, hash kodlarına göre bucket'lara yerleştirilir. Bu
        nedenle, eklenme sırasına göre erişemeyeceğiniz gibi rastgele bir sıralama da garanti edilmez.
        */

        /* HashMap, Hashtable ve ConcurrentHashMap'in ne zaman kullanılir?

        1- HashMap:
           Tek iş parçacıklı uygulamalar için idealdir  çünkü synchronized değildir(ek bir işlem ve zaman gerektirmez)
           Çok iş parçacıklı ortamda kullanılacaksa, dış senkronizasyon mekanizmaları ile korunmalıdır.

        2- Hashtable:
           Eski kod tabanları ve miras uygulamalar için uygundur(Varolan bir kod tabanını korumak veya mevcut bir
           projeyi güncellemek zorunda olduğunuz durumlar)
           Yeni projeler için genellikle önerilmez çünkü daha modern ve performanslı alternatifler vardır.

        3- ConcurrentHashMap:
           Modern ve yüksek performanslı çok iş parçacıklı uygulamalar için en iyi seçenektir.
           (Web sunucuları, veri işlem sistemleri, yüksek trafikli uygulamalar)
           Thread safety ve performansın önemli olduğu her durumda tercih edilir.*/

        Hashtable<String, Integer> studentGrades = new Hashtable<>();

        studentGrades.put("Selma", 70);
        studentGrades.put("Tuba", 75);
        studentGrades.put("Ibrahim", 85);
        studentGrades.put("Sefa", 87);
        // studentGrades.put(null, 50); -- HATA --
        // studentGrades.put("Ahmet", null); -- HATA -- Hashtable null key veya value kabul etmez
        System.out.println(studentGrades); // {Ibrahim=85, Sefa=87, Selma=70, Tuba=75}

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 41);
        stdAges.put(null, 41);
        stdAges.put(null, 39);
        stdAges.put("a", null);
        stdAges.put("b", null);

        System.out.println(stdAges); // {null=39, Ahmet=41, a=null, b=null, Ali=18}

        // ConcurrentHashMap oluşturma

        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();

        // Eleman ekleme

        stock.put("Elma", 10);
        stock.put("Muz", 20);

        // Eleman'a erişme

        System.out.println("Elma'nın stok miktarı : " + stock.get("Elma")); // Elma'nın stok miktarı : 10

        // Güncelleme veya ekleme

        stock.putIfAbsent("Çilek", 30); // Çilek yoksa ekle
        System.out.println(stock); // {Muz=20, Çilek=30, Elma=10}

        stock.replace("Muz", 20, 25); // Muz'un stok bilgilerini update ettik
        System.out.println(stock); // {Muz=25, Çilek=30, Elma=10}

        // Eleman silme
        stock.remove("Elma");
        System.out.println(stock); // {Muz=25, Çilek=30}

        // Stokları yazdırma

        for (Map.Entry<String, Integer> entry : stock.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " stok miktarı : " + value); // Muz stok miktarı : 25
                                                                  // Çilek stok miktarı : 30
        }

        /*
        1) Treemap'ler entry'leri natural order'a gore siraya koyar, bu yuzden yavastirlar
        2) Treemap'ler  thread-safe ve synchronized degildir.
        3) Treemap'lerin key'lerinde null kullanilamaz (Comparator istisnasi var ama onerilmez) ama value kısımlarında
           istediginiz kadar kullanabilirsiniz
        4) Treemapler key'e bakarak siralama yapar
        */

        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        // countryPopulation.put(null, 20000000); -- HATA --
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);

        System.out.println(countryPopulation);
        // {France=null, Germany=83000000, Italy=null, Netherland=18000000, Turkiye=83000000, USA=400000000}

        // NOT: TreeMap'ler natural order siralama yaptigindan ve eleman eklemede "key"lere baktigindan key'lerde null
        // kabul etmez.

        System.out.println("--------------------");

        /* LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.

        ** Örnegin, bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir
        yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
        restoranın sipariş hazırlama sırasını belirler.

        Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
        benzeri senaryolarda da kullanılabilir.
        Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.
        LinkedHashMap sınıfı thread-safe değildir */

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("Ali", 25);
        lhm.put("Can", 18);
        lhm.put("Mehmet", 30);

        for (Map.Entry<String, Integer> entry : lhm.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());  // Ali -> 25
                                                                             // Can -> 18
                                                                             // Mehmet -> 30
        }
    }
}

package d23_oop_collections;

import java.util.*;

public class LinkedList01 {
    public static void main(String[] args) {

        /* Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
        bir class'lar ve interface'ler kümesidir.

        — Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
                Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
                Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
                Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
                Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

        — Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
                Verileri verimli bir şekilde depolamak
                Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
                Verileri güvenli bir şekilde depolamak */

        /* Java da Array'ler neden eksik kaldi da Collection'lar gelistirildi?

        Java'da array'ler eksik kaldı çünkü:

        Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
        İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata
        yapmaya müsaittir.
        Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

        Collections, bu dezavantajları çözmek için tasarlanmıştır. */

        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        // List<String> list3 = new List<>(); -- HATA --

        /* LinkedList: Bağlı bir listedir.

        LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
        LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1) Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
        ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır. */

        // --------------------------------------------------------------------------------------------------

        /* Sonuc:
        LinkedList'in bu hızlı ekleme ve silme işlemleri, bazı senaryolarda tercih edilmesine neden olurken,
        veriye doğrudan erişim gerektiren durumlarda ArrayList daha uygundur.

        Bu nedenle, hangi liste türünün kullanılacağı, uygulamanın gereksinimlerine ve
        yapılacak işlemlerin türüne bağlıdır.

        Eleman ekleme ve silme işlemleri listenin sonundan yapıldığında ArrayList daha uygundur
        Eleman ekleme ve silme işlemleri listenin başında veya ortasında sıkça yapıldığında LinkedList daha uygundur
        */

        // O(1) zaman karmaşıklığı nedir ?

        LinkedList<String> myList = new LinkedList<>();

        // 1- add() : listeye bir elema ekler

        myList.add("Ali");
        myList.add("Veli");
        myList.add("Ayşe");
        myList.add("Fatma");

        System.out.println(myList); // [Ali, Veli, Ayşe, Fatma] -- insertion order -- ekleme sırası

        // ---------- LinkedList'e eleman eklemenin kısa yolları ----------

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Eleman1", "Eleman2", "Eleman3"));
        // System.out.println(linkedList); // [Eleman1, Eleman2, Eleman3]

        LinkedList<String> linkedList1 = new LinkedList<>(List.of("Eleman4", "Eleman5"));
        // System.out.println(linkedList1); // [Eleman4, Eleman5]

        // --------------------

        List<String> immutableList = List.of("Eleman6", "Eleman7"); // Kurucudan değilde, doğrudan elemanlar eklenince
        // sabit bir list oluşur ve yeni eleman eklemez
        // immutableList.add("Serkan");
        // System.out.println(immutableList);

        // --------------------

        // 2- add(int index, E element); belirtilen konuma bir oge ekler

        myList.add(1, "Zeynep");
        System.out.println(myList); // [Ali, Zeynep, Veli, Ayşe, Fatma]

        // 3- addFirst(E e): Listenin basina oge ekler

        myList.addFirst("Hasan");
        System.out.println(myList); // [Hasan, Ali, Zeynep, Veli, Ayşe, Fatma]

        // 4- addLast(E e): Listenin sonuna bir öğe ekler.

        myList.addLast("Hüseyin");
        System.out.println(myList); // [Hasan, Ali, Zeynep, Veli, Ayşe, Fatma, Hüseyin]

        // 5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur

        boolean m1 = myList.remove("Ali");
        System.out.println(myList); // [Hasan, Zeynep, Veli, Ayşe, Fatma, Hüseyin]
        System.out.println(m1); // true

        // 6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır
        // Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        // Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.add("Yusuf");
        myList.add(3,"Yusuf");
        System.out.println(myList); // [Hasan, Zeynep, Veli, Yusuf, Ayşe, Fatma, Hüseyin, Yusuf]

        myList.removeFirstOccurrence("Yusuf");
        System.out.println(myList); // [Hasan, Zeynep, Veli, Ayşe, Fatma, Hüseyin, Yusuf]

        // myList.removeAll(Collections.singleton("Yusuf"));
        // System.out.println(myList); [Hasan, Zeynep, Veli, Ayşe, Fatma, Hüseyin] Tüm belirtilenleri siler

        // 7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        // sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        // Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        // Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.removeLastOccurrence("Yusuf");
        System.out.println(myList); // [Hasan, Zeynep, Veli, Ayşe, Fatma, Hüseyin]

        // removeLast() methodu, bir veri yapısının son elemanını kaldırmak için kullanılır

        // myList.removeLast();
        // System.out.println(myList); // [Hasan, Zeynep, Veli, Ayşe, Fatma]

        // 8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa null dondurur)

        String s = myList.peek();
        System.out.println(s); // Hasan
        System.out.println(myList); // [Hasan, Zeynep, Veli, Ayşe, Fatma, Hüseyin]

        // 9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.

        System.out.println(myList.poll()); // Hasan
        System.out.println(myList); // [Zeynep, Veli, Ayşe, Fatma, Hüseyin]

        // 10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(myList.element()); // Zeynep
        System.out.println(myList); // [Zeynep, Veli, Ayşe, Fatma, Hüseyin]

        // 11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)

        System.out.println(myList.pop()); // Zeynep
        System.out.println(myList); // [Veli, Ayşe, Fatma, Hüseyin]
    }
}

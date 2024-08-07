package d29_iterators_lambda;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {

        /*
        1)  Iterator'ler loop'larin yaptigi ayni isi yapar
        2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
        3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
        4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha
        basarilidir
        5) Iki tip iterator vardir:
            a) Iterator:
            Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
            b) ListIterator:
            Bu eleman silebilir, ekleyebilir ve degistirebilir

            Not:
            Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
            ListIterator iki yonlu calisabilir
         */

        // hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean)
        // next() : Pointer’i bir sonraki elemanin onune konumlandirir ve pointer’in atladigi elemani verir
        // remove() : Pointer’in atladigi elemani siler


        List<String> myList = new ArrayList<>();

        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");

        System.out.println(myList); // [Tom, Jim, Clara, Fatma, Mustafa]

        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()){ // en başa konumlanan pointerdan sonra eleman var mı diye bakar

            // myItr.next(); // pointerı 2.elemanın önüne alır ve atladığı elemanı verir
            // myItr.remove(); // next'in verdiği elemanı siler

            String el = myItr.next();
            if (el.equals("Tom")){
                myItr.remove();
                break;
            }

        }
        System.out.println(myList); // [] // [Jim, Clara, Fatma, Mustafa]

        // ---------- ListIterator ----------

        // 1) set(E e): Koleksiyonun geçerli elemanını değiştirir.

        List<String> yourList = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList); // [Ali, Can, Aliye]

        ListIterator<String> yourListItr = yourList.listIterator();
        // System.out.println(yourListItr);

        while (yourListItr.hasNext()){

            String el = yourListItr.next();
            yourListItr.set(el + "*");
        }
        System.out.println(yourList); // [Ali*, Can*, Aliye*]

        // Ödev : Sadece Can'a ekleyin

         String el = yourListItr.next();
         if (el.equals("Can")){
            yourListItr.set(el + "*");
        }

        // Elemanları sondan başa doğru yazdırınız

        List<String> yourList2 = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList2); // [Ali, Can, Aliye]

        ListIterator<String> listItr2 = yourList2.listIterator(); // [Ali, Can, Aliye]

        // Bu loop pointerı en sağa almak için yazıldı

        while (listItr2.hasNext()){
            listItr2.next();
        }

        while (listItr2.hasPrevious()){ // pointerın solunda eleman var mı diye bakar
            String el1 = listItr2.previous(); // previous pointer'ı sağdan sola yerleştirir
            System.out.println(el1 + " <-- ");
        }
        // Aliye <--
        // Can <--
        // Ali <--

        // hasNext() --> en basa konumlanan pointerdan sonra eleman var mi diye bakar, boolean return eder
        // next() --> pointeri 2.elemanin onune alir ve atladigi elemani verir
        // remove() --> next'in verdigi elemani siler
        // hasPrevious() --> ListIterator'lerde pointer'dan onceki elemani verir
        // set() --> ListIterator'lerde eleman degistirmede kullanilir
    }
}

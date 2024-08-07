package d25_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=33, Veli=63, Ali=18}

        stdAges.put("Tom", 35);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        // 1) replace() methodu, value’lari key’leri kullanarak update etmeye yarar
        // Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom", 39);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        // 2) replace() methodu, eski deger kontrolu yaparak ta calisir

        stdAges.replace("Tom", 21, 45); // Değişiklik olmayacak çünkü Tom'un değeri 21 değil 39
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        stdAges.replace("Tom", 39, 45);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}

        // 3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        // 77 Eklenmez çünkü Tom map'te var

        stdAges.putIfAbsent("Ayşe", 23);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}
        // Ayşe map'te yoktu bu yüzden eklendi

        // 4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        // key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
        // bir varsayılan değer sağlama avantajına sahiptir.

        System.out.println(stdAges.get("Tom")); // 45
        System.out.println(stdAges.getOrDefault("Tom", 18)); // 45
        // 45 çünkü Tom map'te var ve value'su 45

        System.out.println(stdAges.get("Jerry")); // null // Jerry map'te yok, null döndü
        System.out.println(stdAges.getOrDefault("Jerry", 18)); // 18

        // 5) containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        // containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        // Boolean return ederler

        Boolean b = stdAges.containsValue(19);
        System.out.println(b); // true
        System.out.println(stdAges.containsValue(99)); // false

        System.out.println(stdAges.containsKey("TOM")); // false
        System.out.println(stdAges.containsKey("Tom")); // true

        // ---------- Büyük küçük harfe duyarsız yapma ----------

        Map<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Tom".toLowerCase(), 25);

        System.out.println(stdAges2); // {tom=25}

        boolean containsKeyInsensitive = stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(containsKeyInsensitive); // true

        // --------------------
        String emoji = "\uD83E\uDD70";
        System.out.println("Emoji : " + emoji); // Emoji : 🥰
        // https://emojipedia.org/
        // --------------------
    }
}

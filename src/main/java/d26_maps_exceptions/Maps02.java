package d26_maps_exceptions;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        // HashMap arka planda nasil calisiyor?
        // HashMap'in varsayılan boyutu(kapasitesi) 16'dır (0 ila 15).16 adet "bucket" (kova) bulunacağı anlamına gelir.
        // Bu "bucket"lar(kovalar), HashMap içindeki anahtar-değer (key-value) çiftlerini tutar. Bucket'in memory'de
        // kapsadığı alan degiskendir.

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");
        capitals.put("Italy", "Rome");
        capitals.put("Turkiye", "Ankara");
        capitals.get("Turkiye");
        capitals.put("Turkiye", "Istanbul");

        System.out.println(capitals); // {Turkiye=Istanbul, USA=Washington, Italy=Rome}

        // NOT: Java 12 bucket dolunca, bir 16 bucket daha acar ve bu sefer 32'ye bolmeye baslar.
        // (yavaslamayi engellemek icin)
    }
}

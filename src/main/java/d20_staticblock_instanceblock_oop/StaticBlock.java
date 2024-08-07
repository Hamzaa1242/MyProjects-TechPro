package d20_staticblock_instanceblock_oop;

import java.time.LocalDate;

public class StaticBlock {
    static double pi;
    static int price;

    static {
        System.out.println("Static block 2");
        LocalDate currentDate = LocalDate.now();

        if (currentDate.getMonthValue() == 2){ // Alınan tarihin ayını kontrol eder
            price = 1000; // Eğer ay 2 (şubat) ise, fiyatı 1000tl olarak ayarlar, aksi takdirde 2000tl olarak ayarlar
            System.out.println(price);
        } else {
            price = 2000;
            System.out.println(price);
        }
    }

    static { // static block
        pi = 3.14; // static bloklar içinde yerel değişkenler tanımlanamaz ama değer atanır
        System.out.println("Static block 1");
    }
    public static void main(String[] args) {
        /* "static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
         veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
         Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
         Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
         bir şekilde hazır olmasını sağlar. */

        // Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price’i alacak
        // ve class’in heryerinde bu degeri kullanacak.

        // Bir variable olusturup deger atamazsaniz o variable’i initialize etmediniz demektir

        // static bloklar içinde yerel değişkenler tanımlanamaz ama deger atanir

        System.out.println(pi); // 3.14
        System.out.println("main method içi");
    }
}

package d18_datetime_stringbuilder;

import java.time.LocalDate;
import java.time.Period;
import java.time.Duration;

public class DateTime02 {
    public static void main(String[] args) {
        // Örnek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz

        //Java'da Period sınıfı, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak
        // döndürür.

        LocalDate date1 = LocalDate.of(2024, 5, 28);
        LocalDate date2 = LocalDate.of(2022, 12, 24);

        Period difference = Period.between(date2, date1);
        System.out.println(difference); // P1Y5M4D ==> P : Period, 1Y : 1 Yıl, 5M : 5 Month, 4D : 4 Day

        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1 + " ve " + date2 + " arasındaki fark : ");// 2024-05-28 ve 2022-12-24 arasındaki fark :
        System.out.println("Yıl : " + yearDifference); // Yıl : 1
        System.out.println("Ay : " + monthDifference); // Ay : 5
        System.out.println("Gün : " + dayDifference); // Gün : 4

        // Duration Class nedir ?

        // Duration sınıfı genellikle programlama dillerinde veya kütüphanelerde zaman aralıklarını temsil etmek için
        // kullanılır. Bir Duration nesnesi, belirli bir zaman süresini ifade eder ve genellikle günler, saatler,
        // dakikalar, saniyeler ve milisaniyeler gibi farklı zaman birimlerinde tanımlanabilir.

        // 1 saatlik bir Duration oluşturma
        Duration oneHour = Duration.ofHours(1);
        System.out.println("Duration in hours: " + oneHour.toHours());

        // 2 dakikalık bir Duration oluşturma
        Duration twoMinutes = Duration.ofMinutes(2);
        System.out.println("Duration in minutes: " + twoMinutes.toMinutes());

        // İki Duration'ı toplama
        Duration totalDuration = oneHour.plus(twoMinutes);
        System.out.println("Total duration in minutes: " + totalDuration.toMinutes());

        // https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html
    }
}

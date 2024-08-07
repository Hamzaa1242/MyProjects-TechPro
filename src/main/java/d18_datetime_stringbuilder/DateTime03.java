package d18_datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime03 {
    public static void main(String[] args) {
        /*LocalTime Class'ta kullanilan tarih saat formatlari

            HH : mm ==> 24'lu saat sistemi
            hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
            hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
            HH : mm : ss ==> saniyeyi gosterir
            HH : MM ==> yanlis format cunku MM aylar icin kullanilir
            "mm" "minute" demektir. "MM" "month" demektir.

            dd-MM-yyyy ==> gun - ay - yil
            MMM ==> Aug
            MMMM ==> August  */

        //Anlik zamani nasil aliriz?

        //LocalTime kullanacagiz.
        //LocalTime, Java’nın java.time paketinde bulunan bir Class’tir ve sadece saat bilgisini
        //(saat, dakika, saniye ve milisaniye) temsil etmek için kullanılır.
        //Bu sınıf, tarih bilgisini içermez ve yalnızca saatle ilgilidir.

        // Örnek 1: now(): Gecerli saat bilgisini alir.

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); // 21:08:22.453323

        // Örnek 2:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir biçimde görüntülemek,
        // okumak ve işlemek için kullanılan önemli bir araçtır.

        // DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve metni tarih ve
        // saat nesnelerine çözmenize olanak tanır.
        // ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini biçimlendirmek için kullanılır.
        // format() method'u LocalTime'i String'e istedigimiz formatta cevirir

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime); // 09:13:38 ÖS

        // Örnek 3 : Tarihi formatlayalım

        LocalDate myCurrentDate = LocalDate.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate); // 04-Haz-2024

        //ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        // ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        // Tokyo'da ayın kaçı ?

        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); // 2024-06-05

        // Amsterdam'da ayın kaçı ?

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam); // 2024-06-04

        // Tokyo'da saat kaç ?

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo); // 03:22:30.071051900

        // Amsterdam'da saat kaç ?

        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam); // 20:22:30.071051900

        // -----------------------------------------------------------------------------------

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Tüm zaman dilimlerini listeleyelim

        for (String w : zoneIds){
            System.out.println(w); // Tüm ZoneId'leri gösterir
        }

        // Zaman dilimlerinin sayısını yazdıralım

        System.out.println("Toplam zaman dilimi - zone sayısı : " + zoneIds.size());
        // Toplam zaman dilimi - zone sayısı : 603

        // IANA ?

        // IANA, "Internet Assigned Numbers Authority" (İnternet Tahsisli Numaralar Kurumu) kısaltmasıdır. IANA,
        // internette kullanılan çeşitli numaraların ve sembolik dizilerin (domain isimleri, IP adresleri, protokol
        // numaraları vb.) küresel koordinasyonunu sağlar.

        //ornek 5: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2024-06-04T21:29:33.110443100

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy - hh : mm a");
        String formattedLdt = dtf3.format(ldt);
        System.out.println(formattedLdt); // 04/Haz/2024 - 09 : 32 ÖS
    }
}

package d17_constructors_datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {
        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen verilen sırada tarih bilgisini giriniz. (Yıl - Ay - Gün)");

        System.out.println("Lütfen yılı giriniz");
        int year = input.nextInt();

        System.out.println("Lütfen ayı giriniz");
        int month = input.nextInt();

        System.out.println("Lütfen günü giriniz");
        int day = input.nextInt();

        // Kullanıcıdan alınan verilerle bir tarih oluşturalım

        LocalDate givenData = LocalDate.of(year, month, day);

        if (givenData.isBefore(LocalDate.now())){ // Girilen tarih şu andan önce ise
            System.out.println("Geçersiz tarih girdiniz");
        }else {
            System.out.println("Zamanı girebilirsiniz");
        }
    }
}

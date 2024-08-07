package d17_constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
        // Örnek 8: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        // Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input = new Scanner(System.in);
        LocalDate givenData = null;

        while (true){
            System.out.println("Lütfen yılı giriniz");
            int year = input.nextInt();

            System.out.println("Lütfen ayı giriniz");
            int month = input.nextInt();

            if (month < 1 || month > 12){
                System.out.println("Ay 1 ile 12 arasında olmalıdır. Tekrar deneyiniz..");
                continue; // Kullanıcıyı döngünün başına götürür // return içinde bulunduğu methodun çalışmasını durdurur
            }
            System.out.println("Lütfen günü giriniz");
            int day = input.nextInt();

            // O ayın kaç çektiğini bulalım. YearMonth classını kullanacağız

            YearMonth yearMonth = YearMonth.of(year, month);

            // O ayın max gün sayısını bulalım

            int daysInMonths = yearMonth.lengthOfMonth();

            if (day < 1 || day > daysInMonths){
                System.out.println("Girilen ay için geçersiz gün. Tekrar deneyiniz..");
                continue;
            }

            givenData = LocalDate.of(year, month, day);

            if (givenData.isBefore(LocalDate.now())){
                System.out.println("Geçersiz, geçmiş bir tarih girdiniz. Tekrar deneyiniz..");
            } else {
                System.out.println("Zamanı girebilirsiniz");
                break; // Döngüden çık
            }
        }
    }
}

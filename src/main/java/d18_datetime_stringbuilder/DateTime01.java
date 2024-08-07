package d18_datetime_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        // Örnek 1: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen verilen sırada doğum tarihi bilgisini alt alta giriniz.. (yıl - ay - gün)");

        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek()); // Girilen tarihin gününü aldık
    }
}

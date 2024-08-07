package d4_casting_scanner_increment;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz..");

        long number1 = input.nextLong();
        System.out.println("İlk iki basamaktaki rakamlar : " + (number1 / 1000));
        System.out.println("Son iki basamaktaki rakamlar : " + (number1 % 100));
        System.out.println("İlk iki ve son iki basamaktaki rakamların toplamı : " + ((number1 / 1000) + (number1 % 100)));

        // 2.Yol

        int num = input.nextInt();

        int firstTwoDigits = num / 1000;
        int lastTwoDigits = num % 100;

        System.out.println(firstTwoDigits + lastTwoDigits);
    }
}

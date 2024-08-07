package d4_casting_scanner_increment;

import java.util.Locale;
import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("İki adet sayi giriniz..");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Addition : " + (firstNumber + secondNumber));
        System.out.println("Subtraction : " + (firstNumber - secondNumber));
        System.out.printf("Multiplication : %.2f ", (firstNumber * secondNumber));
        System.out.println();
        System.out.println("Division : " + (firstNumber / secondNumber));
    }
}

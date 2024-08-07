package d5_increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        // Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        // 1.Yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");

        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Çift Sayı");
        }

        if (num % 2 != 0){ // num % 2 == 1
            System.out.println("Tek Sayı");
        }

        // 2.Yol : if-else

        if (num % 2 == 0){
            System.out.println("Çift Sayı");
        } else {
            System.out.println("Tek Sayı");
        }
    }
}

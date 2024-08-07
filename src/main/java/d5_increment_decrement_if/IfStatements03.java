package d5_increment_decrement_if;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        // Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yazini

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");

        int num = input.nextInt();

        if (num > 0){
            System.out.println("Pozitiftir.");
        } else if (num < 0) {
            System.out.println("Negatiftir.");
        } else {
            System.out.println("Nötrdür.");
        }
    }
}

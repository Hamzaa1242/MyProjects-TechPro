package d6_if_switch_ternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren
        kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

        //equalsIgnoreCase() iki String’in birbirinin aynisi olup olmadigini
        //buyuk kucuk harfi dikkate almadan kontrol eder

        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismi giriniz..");

        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") ||
                dayName.equalsIgnoreCase("Sunday");

        boolean isWeekday = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");

        if (isWeekendDay){
            System.out.println("Weekend");
        } else if (isWeekday) {
            System.out.println("Weekday");
        } else {
            System.out.println("Geçerli gün ismi giriniz..");
        }
    }
}

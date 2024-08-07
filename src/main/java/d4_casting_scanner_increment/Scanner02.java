package d4_casting_scanner_increment;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz..");
        // nextLine() methodu ile birden fazla kelime girişi alabilirsiniz
        String fullName = input.nextLine();

        System.out.println("Yaşınızı giriniz..");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz..");
        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz..");
        short weight = input.nextShort();

        System.out.println("Medeni durumunuzu giriniz..");
        String maritalStatus = input.next();

        // Kullanıcı bilgilerini konsola yazdıralım
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
    }
}
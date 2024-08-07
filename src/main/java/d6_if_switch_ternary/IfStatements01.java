package d6_if_switch_ternary;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

          0-4 (dahil) ==> bebek
          5-12 (dahil)==> cocuk
          13-20 (dahil) ==> genc
          21-30 (dahil) ==> yetiskin
          30 ustu ==> Tanimlanmamis*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz..");

        int age = input.nextInt();

        if (age < 0){
            System.out.println("Geçerli bir yaş giriniz..");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Çocuk");
        } else if (age < 21) {
            System.out.println("Genç");
        } else if (age < 31) {
            System.out.println("Yetişkin");
        } else {
            System.out.println("Tanımlanmamış Yaş");
        }
    }
}

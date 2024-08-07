package d28_exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        // Cities c = new Cities(); Enum yapısından object oluşturamazsınız

        // 1- Enum daki bir sabite nasil ulasabiliriz?

        Cities il = Cities.IZMIR;
        System.out.println(il.getPlateCode());

        // 2- BURSA sabitinin ismine ulaşalım

        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi); // BURSA

        // 3- ANKARA sabitinin plaka koduna ulaşalım

        int ankaraPK = Cities.ANKARA.getPlateCode();
        System.out.println(ankaraPK); // 6

        // 4- ANTALYA'nın posta koduna ulaşalım

        String antalyaPK = Cities.ANTALYA.getPostalCode();
        System.out.println(antalyaPK); // 07000

        // 5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen plaka kodunu giriniz");

        int plaka = input.nextInt();

        // values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Cities[] sehirler = Cities.values();
        // System.out.println(Arrays.toString(sehirler)); // [ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI, ...]

        if (plaka < 1 || plaka > 81){
            System.out.println("Lütfen 1 ile 81 arası bir plaka kodu giriniz");
        }else {
            for (Cities w : sehirler){
                if (plaka == w.getPlateCode()){
                    System.out.println("Girmiş olduğunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        }
    }
}

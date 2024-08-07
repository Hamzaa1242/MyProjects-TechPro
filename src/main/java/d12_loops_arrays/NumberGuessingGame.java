package d12_loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz

        //Scanner ve Random class'larindan object olusturalim

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 0 - 100 arasında rastgele bir sayı üretilecek

        int rastgeleSayi = random.nextInt(101);

        // Kullanıcının kaç kere tahmin yaptığını takip etmek için bir sayaç oluşturalım

        int denemeSayisi = 0;

        // Kullanıcının yaptığı tahmini saklamak için bir değişken oluşturalım

        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir boolean degisken olusturalim

        boolean tahminDogruMu = false;

        System.out.println("0 - 100 arasında bir sayiyi tahmin etmeye çalisin");

        do {
            // Kullanıcıdan tahmini alalım

            System.out.println("Tahmininizi yapiniz..");
            tahminEdilen = scanner.nextInt();

            // Sayacı bir arttıralım
            denemeSayisi++;

            // Tahmini kontrol edelim

            if (tahminEdilen < rastgeleSayi){
                System.out.println("Sayı daha büyük");
            }else if (tahminEdilen > rastgeleSayi){
                System.out.println("Sayı daha küçük");
            }else {
                tahminDogruMu = true;
                System.out.println("Tebrikler, doğru tahmin");
                System.out.println("Deneme Sayısı : " + denemeSayisi);
            }
        }while (!tahminDogruMu);
        scanner.close();

        // ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?
    }
}

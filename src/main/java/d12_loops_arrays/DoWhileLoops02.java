package d12_loops_arrays;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {
        /*Ornek 1:
           Gecerli Username="admin" ve Password="pwd123" dur.
           Kullanicidan username ve password'u alin.
           Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
           Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
           Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
        */

        Scanner input = new Scanner(System.in);

        int counter = 0;
        int maxTries = 4; // Deneme sayısı bilgisi için oluşturduk. 4 hak var.

        do {
            System.out.println("Lütfen username giriniz..");
            String userName = input.next();

            System.out.println("Lütfen password giriniz..");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabınıza hoşgeldiniz!");
                break;
            } else {
                counter++;
                if (counter == maxTries){
                    System.out.println("Hesabınız bloke olmuştur");
                    break;
                } else { // Kullanıcıya kalan hak sayısını gösterelim
                    int remainingTries = maxTries - counter;
                    System.out.println("Yanlış kullanıcı adı veya parola, " + remainingTries + " Hakkınız kaldı");
                }
            }
        } while (true); // sonsuz döngü olur. içerden kırılmadığı sürece çalışacak
    }
}

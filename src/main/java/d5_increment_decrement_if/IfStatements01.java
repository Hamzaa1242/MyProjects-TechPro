package d5_increment_decrement_if;

public class IfStatements01 {
    public static void main(String[] args) {

        if (3 < 5){
            System.out.println("condition doğru if çalıştı..");
        }

        if (7 == 4 + 3){
            System.out.println("condition doğru if çalıştı..");
        }

        // Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana “Rakam” yazdirin

        int num = 7;

        if (num >= 0 && num < 10){ // num >= 0
            System.out.println("Rakam");
        }

        // Ornek 2: Sayi uc basamakli ise ekrana “Sayi üç basamaklidir” yazdirin

        int n = 123;

        if (n > 99 && n < 1000){
            System.out.println("Sayı üç basamaklıdır.");
        }
    }
}

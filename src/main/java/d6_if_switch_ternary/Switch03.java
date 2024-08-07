package d6_if_switch_ternary;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*Yeni switch ifadesi, daha esnek ve güçlü bir yapı sunarak, geleneksel switch-case
        yapısının daha temiz ve ifade edilebilir hale getirilmesini sağlar.

        Ayrıca, daha önceki switch yapısı değer döndürmezken, yeni switch ifadesi bir değer döndürebilir
         ve bu değer doğrudan bir değişkene atanabilir.

        Yeni switch ifadesinin ana özellikleri:

        Case değerleri: Birden fazla case ifadesini tek bir işlemle birleştirme imkanı.
        Arrow (->) Operatörü: Geleneksel break yerine kullanılarak, kodun daha okunabilir olmasını sağlar.*/

        /*Ornek 1:  Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
        Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz (1-12)");

        int month = scanner.nextInt();

        String season = switch (month){
          case 12,1,2 -> "Kış";
          case 3,4,5 -> "İlkbahar";
          case 6,7,8 -> "Yaz";
          case 9,10,11 -> "Sonbahar";
            default -> "Bilinmeyen Ay";
        };
        System.out.println("Mevsim : " + season);
        scanner.close(); // scanner objesi kapatıldı - best practice
    }
}

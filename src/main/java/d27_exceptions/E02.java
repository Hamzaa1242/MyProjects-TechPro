package d27_exceptions;

public class E02 {
    public static void main(String[] args) {

        // 2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s = "1234a";
        convertStringToInt(s); // 1235

    } // MAİN DIŞI

    public static void convertStringToInt(String s){
        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1); // 1235
        }catch (NumberFormatException e){
            System.out.println("Dönüşüm için rakam dışı karakter kullanmayınız : " + e.getMessage());
            // Dönüşüm için rakam dışı karakter kullanmayınız : For input string: "1234a"
        }
        // Java'da alınan hatayı (exception) konsola yazdırma dışında dışarıya alabilir miyiz ?
        // Evet, Java'da alınan hataları (exceptions) sadece konsola yazdırmak yerine, dışarıya almanın birkaç yolu
        // vardır. Bu yollar arasında hataları bir dosyaya yazmak, bir loglama kütüphanesi kullanmak veya hata
        // detaylarını bir veritabanına kaydetmek gibi yöntemler bulunmaktadır.
    }
}

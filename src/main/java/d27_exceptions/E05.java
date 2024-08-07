package d27_exceptions;

public class E05 {
    public static void main(String[] args) {

        // try blogundan sonra birden fazla catch bloğu kullanabilir miyiz? Evet, kullanabiliriz

        int a = 12;
        int b = 3;
        String s = "My Java";
        // getCharFromString(s, a, b);
        getCharFromString2(s, a, b);

    } // MAİN DIŞI

    public static void getCharFromString(String s, int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        }catch (ArithmeticException e){
            System.out.println("Sıfıra bölme yapmayınız " + e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandınız " + e.getCause()); // Hatanın sebebini verir
        }
    }

    // 2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir

    public static void getCharFromString2(String s, int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (Exception e){
            System.out.println("Bir istisna oluştu " + e.getClass()); // getClass() exception'ın türünü söyler
        }
    }
}

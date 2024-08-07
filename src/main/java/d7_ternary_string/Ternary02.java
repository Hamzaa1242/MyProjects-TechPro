package d7_ternary_string;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int a = -123;

        a = Math.abs(a); // absolute value - mutlak değer alır
        String result = (a > 99 && a < 1000) ? "Üç basamaklıdır" : "Üç basamaklı değildir";
        System.out.println(result); // Üç basamaklıdır
    }
}

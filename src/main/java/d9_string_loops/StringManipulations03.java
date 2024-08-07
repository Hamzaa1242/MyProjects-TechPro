package d9_string_loops;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
        //isBlank() metodu ise hem hicligi hemde space’i kontrol eder(true verir)

        String pwd = " a";

        // 1-

        boolean first = pwd.isEmpty();
        System.out.println(first); // false (içi dolu) "" - true, "a" - false, " " - false

        // 2-

        boolean second = pwd.isBlank();
        System.out.println(second); // false (içi dolu) "" - true, "a" false, " " - true

        // 3-
        // Başındaki veya sonundaki boşlukları alınca, ilk haline eşitse, orjinalinde boşluk yoktur

        boolean third = pwd.trim().equals(pwd);
        System.out.println(third); // true

        if (first){
            System.out.println("Parola hiçbir şey yazmadan geçilemez");
        }
        if (second){
            System.out.println("Parola boş bırakılmamalı ve boşluk harici karakterlerde bulunmalıdır");
        }
        if (!third){
            System.out.println("Parolanın başında ve sonunda boşluk olmamalıdır");
        }
    }
}

package d31_lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        // removeIfLengthGreaterThanFive(myList); // [Ali, Elif, Yusuf, Elif]

        // removeIfElementsStartsWithZorEndsWithf(myList); // [Ali, Mustafa]
        // removeIfElementsStartsWithZorEndsWithf(myList); // [Ali, Mustafa]

        // removeIfElementsContainsX(myList); // [Ali, Elif, Yusuf, Elif, Zeynep, Mustafa]

    }

    // 1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    // removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
    // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır, stream kullanılmadan çağırılır

    public static void removeIfLengthGreaterThanFive(List<String> list){
        list.removeIf(t -> t.length() > 5);
        System.out.println(list);
    }

    // 2) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.

    // 1. Yol

    /* public static void removeIfElementsStartsWithZorEndsWithf(List<String> list){
        list.removeIf(t -> t.charAt(0) == 'Z' || t.charAt(t.length() -1) == 'f');
        System.out.println(list);
    } */

    // 2. Yol

    public static void removeIfElementsStartsWithZorEndsWithf(List<String> list){
        list.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(list);
    }

    // 3) “X” karakteri iceren elemanları silen bir method oluşturun.

    public static void removeIfElementsContainsX(List<String> list){
        list.removeIf(t -> t.contains("X"));
        System.out.println(list);
    }
}

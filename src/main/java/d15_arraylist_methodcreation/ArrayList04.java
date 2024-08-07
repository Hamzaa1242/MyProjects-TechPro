package d15_arraylist_methodcreation;

import java.util.Arrays;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        // Bir List olusturmak icin kisa yol - Array gibi çalışmaya başlayan bir list oluşur.
        // Eleman sayısını değiştiren methodları kullanamazsınız

        List<Integer> myList = Arrays.asList(1, 3, 4, 9, 7);
        System.out.println(myList); // [1, 3, 4, 9, 7]

        // myList.remove(0); -- HATA --
        // myList.add(5); -- HATA --
        // myList.clear(); -- HATA --

        myList.set(0, 5);
        System.out.println(myList); // [5, 3, 4, 9, 7]
        System.out.println(myList.size()); // 5
    }
}

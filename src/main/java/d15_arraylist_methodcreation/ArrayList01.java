package d15_arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //      [J, a, v, a, v] ==> [J, a, v]

        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a); // [J, a, v, a, v]

        List<Character> b = new ArrayList<>();
        for (Character w : a){
            if (!b.contains(w)){ // b listinde döngüden gelen elemanlar yoksa
                b.add(w); // b listine gelen elemanı yükle
            }
        }
        System.out.println(b); // [J, a, v]
    }
}

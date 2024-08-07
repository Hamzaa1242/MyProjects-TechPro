package d25_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps03 {
    public static void main(String[] args) {

        // ornek 1: Size verilen bir String’deki her kelimenin, o String’de kac defa kullanildigini
        // gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)

        String s = "Ali nasilsin Ali.";

        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s); // ali nasilsin ali

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words)); // [ali, nasilsin, ali]

        HashMap<String, Integer> myMap = new HashMap<>();
        System.out.println(myMap); // {}

        for (String w : words){
            Integer isThere = myMap.get(w);
            // İlk döngüde w'nun içine ali yüklenecek, map'te ali olmadığından null dönecek

            if (isThere == null){
                myMap.put(w, 1); // map'te yoksa w'dan yani ali'den 1 tane koy
            }else {
                myMap.put(w, isThere + 1);
            }
        }
        System.out.println(myMap); // {nasilsin=1, ali=2}

        // ornek 2: Size verilen bir String’deki her harfin o String’de kac defa kullanildigini gosteren kodu yaziniz.
        //      “Hello” ==> H=1, e=1, l=2, o=1

        // Arraye yükleyeceğiz

        String hello = "Hello";
        String[] helloArray = hello.split("");
        System.out.println(Arrays.toString(helloArray)); // [H, e, l, l, o]

        HashMap<String, Integer> helloMyMap = new HashMap<>();
        System.out.println(helloMyMap); // {}

        for (String w : helloArray){
            Integer i = helloMyMap.get(w);

            if (i == null){
                helloMyMap.put(w, 1);
            } else
                helloMyMap.put(w, i + 1);
        }
        System.out.println(helloMyMap); // {e=1, H=1, l=2, o=1}
    }
}

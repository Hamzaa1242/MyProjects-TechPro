package d14_multidimensionalarrays_arraylist;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Cok boyutlu dizi (MultiDimensional Array) temel olarak Array’in içine Array koymak anlamına gelir.
        // En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
        // İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.

        // MultiDimensional Array nasıl oluşturulur ?

        int[][] a = new int[3][2]; // 3 dıştaki, 2 içteki eleman sayısı

        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 0;

        // System.out.println(Arrays.toString(a)); MultiDimensional Arrayleri toString() değil, deepToString() methodu
        // ile kullanırız

        System.out.println(Arrays.deepToString(a)); // [[5, 12], [81, 45], [123, 0]]

        // MultiDimensional Array’den spesifik bir eleman nasil yazdirilir?

        System.out.println(a[1][1]); // 45

        // MultiDimensional Array icindeki bir Array nasil yazdirilir?

        System.out.println(Arrays.toString(a[2])); // [123, 0]

        // Kisa yoldan MultiDimensional Array nasil olusturulur?

        String[][] students = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"}};
        System.out.println(Arrays.deepToString(students));
        // [[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan], [Ceyhan, Burhan]]

        // Ornek 1: Yukaridaki students array’inde toplam kac isim oldugunu bulunuz.

        int sum = 0;

        for (String[] w : students){
            sum = sum + w.length;
        }
        System.out.println(sum); // 8

        // Ornek 2: Yukaridaki students Array’inde icinde “m” olan isimleri console’a yazdiriniz.

        System.out.println("----------------");

        for (String[] w : students){
            for (String k : w){
                if (k.contains("m")){
                    System.out.println(k); // Kemal , Cemal
                }
            }
        }
    }
}

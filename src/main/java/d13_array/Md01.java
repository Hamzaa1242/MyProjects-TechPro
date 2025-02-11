package d13_array;

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
    }
}

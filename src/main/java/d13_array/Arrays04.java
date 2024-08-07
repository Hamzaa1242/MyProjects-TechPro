package d13_array;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        // Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] newArr = new int[arr.length];

        System.out.println(Arrays.toString(arr)); // [0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(newArr)); // [0, 0, 0, 0, 0, 0]

        int firstIndex = 0; // indexlere yükleme yaptıkça bunu arttıracağız ki diğer indexleride değiştirebilelim

        for (int w : arr){
            if (w != 0){ // Arrayden gelen sayı sıfıra eşit değilse
                newArr[firstIndex] = w; // newArr nin ilk indexine gelen sayıyı yükledik
                firstIndex++; // ilk indexi (0) bir arttırdık çünkü oraya yükleme yapılmıştı
            }
        }
        System.out.println(Arrays.toString(newArr)); // [2, 3, 12, 0, 0, 0]

        // Arraylerin eşit olup olmadığı nasıl anlaşılır ?

        int[] a = new int[3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;

        int[] b = new int[3];
        b[0] = 2;
        b[1] = 1;
        b[2] = 3;

        // İki arrayin aynı olabilmesi için aynı indexte aynı elemanların bulunması gerekir
        boolean result = Arrays.equals(a,b);
        System.out.println("result = " + result); // result = true
    }
}

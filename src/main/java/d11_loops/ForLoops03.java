package d11_loops;

import java.util.Scanner;

public class ForLoops03 {
    public static void main(String[] args) {
        // Ornek 2:  Kullanıcıdan aldığınız değerler ile "X"lerden bir şekil oluşturunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Satır sayısını giriniz..");
        int row = input.nextInt();

        System.out.println("Sütun sayısını giriniz..");
        int column = input.nextInt();

        for (int i = 1 ; i <= row ; i++) {
            for (int k = 1 ; k <= column ; k++){
                System.out.print("X ");
            }
            System.out.println();
        }

        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.

                *
                * *
                * * *
                * * * *

        */
    }
}

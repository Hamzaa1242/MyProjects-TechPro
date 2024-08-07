package d11_loops;

public class ForLoops02 {
    public static void main(String[] args) {
        /*
         ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
            Week: 1
                 Day: 1
                 Day: 2
                 Day: 3
                 .....
            Week: 2
                 Day: 1
                 Day: 2
                 Day: 3
                 .....
        */

        for (int i = 1 ; i < 5 ; i++) { // Bir ayda 4 hafta olduğu için
            System.out.println("Week : " + i);

            for (int j = 1; j < 8; j++) { // 7 gün için yazdık
                System.out.println("     Day : " + j);
            }
        }
    }
}

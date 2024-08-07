package d11_loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //ornek 1: 6'dan 10'a kadar tum int’lerin toplamini console’a yazdiriniz.
        //      6+7+8+9+10=40 ==> 40

        int sum = 0;

        for (int i = 6 ; i < 11 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console’a yazdiriniz.
        //      10x9x8x7 ==> 5040

        int multiply = 1;

        for (int i = 10 ; i > 6 ; i--) {
            multiply = multiply * i;
        }
        System.out.println(multiply); // 5040
    }
}

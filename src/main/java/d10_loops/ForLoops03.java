package d10_loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.

        // 578 ==> 5+7+8=20 ==> Output 20 olmali

        String s = "578";
        int sum = 0;

        for (int i = 578 ; i > 0 ; i = i/10) { // i /= 10
            sum = sum + i % 10;
        }
        System.out.println(sum); // 20

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.

        // Yusuf ==> Ysf

        String t = "Yusuf";
        String unique = "";

        for (int i = 0 ; i < t.length() ; i++) {
            char ch = t.charAt(i); // index vereceğiz bize harfi verecek

            if (t.indexOf(ch) == t.lastIndexOf(ch)){
                unique = unique + ch;
            }
        }
        System.out.println(unique); // Ysf
    }
}

package d7_ternary_string;

public class Ternary03 {
    public static void main(String[] args) {
        /*Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.

        1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil */

        // (c) ? ((c) ? (t) : (f)) : ((c) ? (t) : (f))

        int year = 2004;

        String result = (year % 100 == 0) ?
                ((year % 400 == 0) ? ("Leap Year") : ("Leap Year değil")) :
                ((year % 4 == 0) ? ("Leap Year") : ("Leap Year değil"));
        System.out.println(result);
    }
}

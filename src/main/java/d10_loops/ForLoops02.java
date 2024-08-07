package d10_loops;

public class ForLoops02 {
    public static void main(String[] args) {
        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> "Tramvay"==> "Tr"*/

        String s = "Tramvay";

        //charAt() methoduna index verince size karakteri getirir.
        //break keyword'u, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.

        for (int i = 0; i < s.length() ; i++) { // i <= s.length() - 1 de yazabilirdik

            char ch = s.charAt(i);

            if (ch == 'a'){
                break; // a yı görünce döngü kırılacak
            }
            System.out.print(s.charAt(i)); // Tr
        }

        System.out.println();

        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A

        String s1 = "Pwd12?Ab";

        for (int i = 0; i < s1.length() ; i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                continue;
            }else {
                System.out.print(ch); // P12?A
            }
        }

        System.out.println();

        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.

        // String t = "Ali Can";  ==> "naC ilA"
        // Loop olustururken baslangic ve bitis degeri cok onemlidir

        // son index her zaman length()-1’tir

        String t = "Ali Can";
        String reverse = ""; // ters çevirince bunun içinde saklayacağız

        for (int i = t.length()-1 ; i >= 0 ; i--) {
            reverse = reverse + t.charAt(i);
        }
        System.out.println(reverse); // naC ilA
    }
}

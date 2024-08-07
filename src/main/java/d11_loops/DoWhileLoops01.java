package d11_loops;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        // do-while döngüsü, döngü bloğundaki kodun en az bir kere çalışacağından
        // emin olmak istediğiniz zaman kullanılır. Yani döngüdeki kodlar,
        // koşul kontrolü yapılırken bile olsa, en az bir kez çalışacaktır.

        // Baslangic degeri
        /* do {
                //calisacak kodlar
                //artirma / eksiltme
            } while (Loop calisma kurali);
        */

        // Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console’a yazdiriniz.

        int i = 5;

        do {
            System.out.println(i);
            i--;
        } while (i > 2);
    }
}

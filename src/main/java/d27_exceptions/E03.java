package d27_exceptions;

public class E03 {
    public static void main(String[] args) {

        // 3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        // selectChar(s, 2);  v
        selectChar(s, 5);

    } // MAİN DIŞI

    public static void selectChar(String s, int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (Exception e){
            System.err.println("Olmayan index'leri kullanmayınız : " + e.getMessage());
            // Olmayan index'leri kullanmayınız : Index 5 out of bounds for length 4
            e.printStackTrace(); // Kod yazan hataları görmek isterse kullanılır. exception fırlatılmaz
        }
        System.out.println("App çalışıyor");
    }
}

package d28_exceptions_enum_iterators;

public class E04 {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int[] c = {3, 5, 7, 9};
        bring(c, a, b);

    }

    public static void bring(int[] c, int a, int b){

        try {
            int idx = a / b;
            int element = c[idx]; // ArrayIndexOutOfBoundsException fırlattı
            System.out.println(element);

        }finally {
            System.out.println("Database ile bağlantıyı kesiniz"); // Çalıştı
        }
        System.out.println("Finally sonrası app çalışıyor"); // Catch olmadığı için çalışmadı
    }
}

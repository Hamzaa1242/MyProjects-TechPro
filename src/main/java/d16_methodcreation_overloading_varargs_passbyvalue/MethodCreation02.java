package d16_methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {
        int result = multiply(3, 5);
        System.out.println(result); // 15

        int result2 = firstTwoMultiplyThirdAdd(4, 4, 2);
        System.out.println(result2); // 18

        print("Ali Can"); // Ali Can

    } // MAİN DIŞI

    // ornek 1: Iki sayiyi carpan bir method olusturunuz.

    //protected: Bu class’tan erisilebilir.
    //Bir de sadece miras alinan class’lardan erisilebilir(extends)

    protected static int multiply(int a, int b) {
        return a * b;
    }

    // ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }

    // ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)

    // Eger bir method yeni bir data uretmiyor ise return type’i void olur.void ise return yazilmaz

    public static void print(String str) {
        System.out.println(str);
    }
}

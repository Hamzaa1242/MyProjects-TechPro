package d9_string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        // 1.Yol : Hard coding - static code - tavsiye edilmez

        String a = "abc@gmail.com";
        System.out.println(a.substring(4,9)); // gmail

        // 2.Yol : Dinamik

        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1); // gmail

        // 3.Yol : Dinamik

        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        int staringIndex = a.indexOf("@")+1; // 3
        int endingIndex = a.indexOf("."); // 9

        String companyName = a.substring(staringIndex,endingIndex);
        System.out.println(companyName); // gmail
    }
}

package d8_string_manipulations;

public class StringManipulations05 {
    public static void main(String[] args) {
        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        // 1.Yol : Hard Coding (Static) - Tavsiye edilmez

        String company = "abc@gmail.com";
        System.out.println(company.substring(4,9)); // gmail

        // 2.Yol : Dinamik

        String company1 = company.split("@")[1].split("\\.")[0];
        System.out.println(company1); // gmail
    }
}

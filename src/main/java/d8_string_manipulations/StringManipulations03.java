package d8_string_manipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz..");

        String pwd = input.nextLine();

        // i)

        boolean lengthControl = pwd.length() > 7;
        // System.out.println("lengthControl = " + lengthControl); // true

        // ii)

        boolean spaceControl = pwd.replaceAll("[^ ]","").length() == 0;
        // boolean spaceControl = !pwd.contains(" ");
        // boolean spaceControl = pwd.replaceAll("[^ ]","").isEmpty();
        // System.out.println("spaceControl = " + spaceControl);

        // iii)

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length() > 0;
        // System.out.println("upperCaseControl = " + upperCaseControl);

        // iv)

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length() > 0;
        // System.out.println("lowerCaseControl = " + lowerCaseControl);

        // v)

        boolean digitControl = pwd.replaceAll("[^0-9]","").length() > 0;
        // System.out.println("digitControl = " + digitControl);

        // En az 1 sembol içermeli

        boolean symbolControl = pwd.replaceAll("^\\p{Punct}","").length() > 0;
        // System.out.println("symbolControl = " + symbolControl);


        if (!lengthControl){
            System.out.println("Şifre en az 8 karakterli olmalıdır");
        } if (!spaceControl){
            System.out.println("Şifrede space karakteri bulunmamalıdır");
        } if (!upperCaseControl){
            System.out.println("Şifre en az bir tane büyük harf içermelidir");
        } if (!lowerCaseControl){
            System.out.println("Şifre en az bir tane küçük harf içermelidir");
        } if (!digitControl){
            System.out.println("Şifre en az bir tane rakam içermelidir");
        } if (!symbolControl){
            System.out.println("Şifre en az bir tane sembol içermelidir");
        }


        boolean isValid = lengthControl &&
                spaceControl &&
                upperCaseControl &&
                lowerCaseControl &&
                digitControl &&
                symbolControl;

        if (isValid){
            System.out.println("Şifre geçerlidir");
        } else {
            System.out.println("Şifre geçerli değildir");
        }
    }
}

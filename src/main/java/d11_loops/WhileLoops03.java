package d11_loops;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //      Palindrome: 121 <==> 121    123321 <==> 123321

        int k = 312;

        String original = String.valueOf(k); // "312"
        String reversed = ""; // ters çevirilmiş olanı bunun içinde saklayacağız

        int index = original.length()-1; // son indexi alıp index variableına yükledik

        while (index >= 0){
            reversed = reversed + original.charAt(index);
            index--;
        }
        System.out.println(reversed); // "213"

        if (original.equals(reversed)){
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom değildir");
        }
    }
}

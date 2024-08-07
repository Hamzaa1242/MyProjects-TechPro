package d3_datatypes_concat_operators;

public class Operators {
    public static void main(String[] Args){
        /*
        +,-,*,/ islemleri Java'da matematikte kullanildigi gibi kullanilir

        Not 1: Java'da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
        Not 2: Eger sonuc tamsayi degilse java sonucun ondalik kismini silerek onu int'e donusturur.
        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
         */

        int amountOfMoney1 = 25;
        int numberOfPeople1 = 10;

        System.out.println(amountOfMoney1 / numberOfPeople1); // 2

        double amountOfMoney2 = 25; // 8byte ondalıklı
        int numberOfPeople2 = 10; // 4 byte ondalıklı

        System.out.println(amountOfMoney2 / numberOfPeople2); // 2.5
        // Büyüklükten kasıt, daha fazla bilgi depolayabilendir
    }
}

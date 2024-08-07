package d31_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        // beginNotWithE(myList); // Ali Yusuf Zeynep Mustafa

        // printDistinctElementLengthLessThanFive(myList); // Ali Elif

        // List<String> donusList = getElementLengthMoreThanFiveWithUpperCase(myList);
        // System.out.println(donusList); // [ZEYNEP, MUSTAFA]

        // printElementsLengthLessThanFiveUniqueLowerCase(myList); // ali elif

        // printElementsUniqueToUpperCaseSorted(myList); // ALİ ELİF MUSTAFA YUSUF ZEYNEP

        // printElUniqueLowerCaseSortWithLength(myList); // ali elif yusuf zeynep mustafa

    }

    // ornek 9: Bir listedeki “E” harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun

    public static void beginNotWithE(List<String> list){
        list.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }

    // ornek 10: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız) elemanları konsola
    // yazdıran bir metod yazınız.

    public static void printDistinctElementLengthLessThanFive(List<String> list){
        list.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                forEach(t -> System.out.print(t + " "));
    }

    // Örnek 11 : Bir List<String> içinde karakter sayısı 5'ten fazla olan tüm elemanları büyük harfe çevirip, bu
    // elemanları yeni bir liste olarak döndüren bir metod yazınız.

    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String> list){
        /* return list.
                stream().
                filter(t -> t.length() > 5).
                map(t -> t.toUpperCase()).
                collect(Collectors.toList()); */

        return list.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }

    // Örnek 12 : Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz elemanları
    // küçük harflere çevirip doğal sıralamaya göre konsola yazdıran bir metod yazınız.

    public static void printElementsLengthLessThanFiveUniqueLowerCase(List<String> list){
        list.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(t -> t.toLowerCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    // Örnek 13 : Bir List<String> içindeki tüm elemanları benzersiz hale getirip, büyük harflere dönüştürdükten
    // sonra alfabetik sıraya göre konsola yazdıran bir metod yazınız.

    public static void printElementsUniqueToUpperCaseSorted(List<String> list){

        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    // Örnek 14 : Bir List<String> içindeki tüm elemanları önce benzersiz hale getirin, ardından küçük harflere çevirin
    // ve elemanların uzunluklarına göre küçükten büyüğe sıralayarak konsola yazdıran bir metod yazınız.

    // Comparator.comparing(): Comparator sınıfında bulunan comparing metodu,
    // belirtilen bir fonksiyona göre karşılaştırma yapmak için bir karşılaştırıcı (comparator) oluşturur.

    // sorted(Comparator.comparing(t->t.length())) ifadesi, stream içindeki elemanları uzunluklarına
    // göre artan sırayla sıralar. Eğer ters sıralama istenirse, reversed() metodu eklenerek
    // sorted(Comparator.comparing(String::length).reversed()) şeklinde kullanılabilir.

    public static void printElUniqueLowerCaseSortWithLength(List<String> list){
        list.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);
    }
}

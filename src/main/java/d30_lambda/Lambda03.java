package d30_lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        // ornek 9: Bir listedeki “E” harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun

        beginNotWithE(myList); // Ali Yusuf Zeynep Mustafa

    }

    public static void beginNotWithE(List<String> list){

        list.
                stream().
                distinct().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }
}

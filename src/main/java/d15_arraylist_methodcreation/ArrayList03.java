package d15_arraylist_methodcreation;
import java.util.Collections;
import java.util.*;

public class ArrayList03 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz
        //      [12, 23, 10, 19] ==> 12 ve 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        // Collections.sort(nums);
        nums.sort(null); // daha modern
        System.out.println(nums); // [10, 12, 19, 23]

        int minDiff = nums.get(1) - nums.get(0); // 12 - 10 = 2
        System.out.println(minDiff); // 2

        for (int i = 1 ; i < nums.size() ; i++) { // Döngüyü 1.indexten başlattık ki 1.den 0.yı çıkaralım
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));
        }
        System.out.println(minDiff); // 2

        // En küçük farkı (minDiff) hangi ki sayıdan bulduk, araştıralım

        for (int i = 1 ; i < nums.size() ; i++) {
            if (nums.get(i) - nums.get(i - 1) == minDiff){
                System.out.println(nums.get(i) + " ve " + nums.get(i - 1)); // 12 ve 10
            }
        }
    }
}

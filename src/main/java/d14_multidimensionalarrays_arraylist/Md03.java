package d14_multidimensionalarrays_arraylist;

public class Md03 {
    public static void main(String[] args) {
        // Ornek 1: int turunde bir Multidimensional Array'deki en kucuk ve en buyuk elemanin toplamini bulunuz

        int[][] ages = {{15, 4},{12, 43, 21}}; // ==> 4 + 43 = 47

        int smallest = ages[0][0]; // 15
        int biggest = ages[0][0]; // 15

        for (int[] w : ages){
            for (int k : w){
                smallest = Math.min(smallest, k);
                biggest = Math.max(biggest, k);
            }
        }
        System.out.println(smallest); // 4
        System.out.println(biggest); // 43
        System.out.println(smallest + biggest); // 47
    }
}

package d30_lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        // 3- Supplier<T> arayüzü, parametre almaz ve bir değer döndürür.
        // Rastgele veya sabit bir değer döndürmek için kullanılabilir.

        // Ornek: SupplierInterface adinda bir class acarak rastgele sayi ureten bir method olusturalim

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number : " + randomSupplier.get()); // Random number : 0.9885704316458537
    }
}

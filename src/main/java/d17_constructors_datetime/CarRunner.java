package d17_constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {

        // 4- Car classından object üretelim // 9- Default constructor içine parametre girelim

        Car c1 = new Car("BMW", "3.20", 2023, false);
        System.out.println(c1.brand); // Honda // BMW
        System.out.println(c1.model); // Accord // 3.20
        System.out.println(c1.year); // 2023 // 2023
        System.out.println(c1.hybrid); // true // false

        c1.action(); // Honda hızlı hareket eder // BMW hızlı hareket eder
        c1.stop(); // Honda güvenli bir şekilde durur // BMW güvenli bir şekilde durur

        // 5- Car classa geri dönelim

        // 10- Car classtan bir object daha üretelim

        Car c2 = new Car("Audi", "A4", 2018, false);
        System.out.println(c1); //  Car{brand = 'BMW', model = '3.20', year = 2023, hybrid = false}
        System.out.println(c2); // Car{brand = 'Audi', model = 'A4', year = 2018, hybrid = false}

        // 11- Car classta toString methodu olmayınca reference yazdırılır
        // Javada toString methodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için
        // kullanılır

        // 14- Car classtan bir object daha üretelim - BİTTİ

        Car c3 = new Car("Tofaş", "Şahin");
        System.out.println(c3); // Car{brand = 'Tofaş', model = 'Şahin', year = 2023, hybrid = true}
    }
}

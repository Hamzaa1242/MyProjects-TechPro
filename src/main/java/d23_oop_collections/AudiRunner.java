package d23_oop_collections;


public class AudiRunner {
    public static void main(String[] args) {

        // Engine e = new Engine(); Soyut bir yapıdan object üretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo(); // Audi A4 turbo motor kullanır
        a4.analog(); // Audi A4 analog klima kullanır
        a4.esp(); // Audi A4 esp fren sistemi kullanır

        // a4.run(); // Audi A4 hava yastığı çalıştırır // ambiguity - belirsizlik
        ((Engine)a4).run(); // Audi A4 hava yastığı çalıştırır // Engine interface'inden gelen run() methodu çalıştı

        // Engine.price = 5000; HATA verir. Çünkü değiştirilemez

        System.out.println(Engine.fiyat); // 300
        System.out.println(AC.fiyat); // 200
        System.out.println(Brake.fiyat); // 100

        Engine.speed(); // Saatte 200km // Interface üzerinden eriştik çünkü static
        a4.power(); // 200HP // Object üzerinden eriştik
    }
}

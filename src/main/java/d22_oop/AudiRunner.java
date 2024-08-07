package d22_oop;

public class AudiRunner {
    public static void main(String[] args) {

        // Engine e = new Engine(); Soyut bir yapıdan object üretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo(); // Audi A4 turbo motor kullanır
        a4.analog(); // Audi A4 analog klima kullanır
        a4.esp(); // Audi A4 esp fren sistemi kullanır

        AudiS5 s5 = new AudiS5();
        s5.gas(); // Audi S5 benzinli motor kullanır
        s5.digital(); // Audi S5 digital klima kullanır
        s5.abs(); // Audi S5 abs fren sistemi kullanır
    }
}

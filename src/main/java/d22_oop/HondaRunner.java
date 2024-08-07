package d22_oop;

public class HondaRunner {
    public static void main(String[] args) {

        // Honda h = new Honda(); // HATA -- Honda is abstract ; cannot be instantiated
        // Abstract classlardan object üretemezsiniz

        Civic c = new Civic();
        c.engine(); // Gas 1.6 Eco

        Accord a = new Accord();
        a.engine(); // Gas 2.0 Turbo

        a.music(); // Pro
    }
}

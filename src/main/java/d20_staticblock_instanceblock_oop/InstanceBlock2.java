package d20_staticblock_instanceblock_oop;

public class InstanceBlock2 {

    public int year;

    {
        System.out.println("Herkese selam");
    }

    public InstanceBlock2() {
        // Buradaki kodu instance block içine aldık
    }

    public InstanceBlock2(int year) {
        // Buradaki kodu instance block içine aldık
        this.year = year;
    }
}

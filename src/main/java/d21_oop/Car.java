package d21_oop;

public class Car extends Vehicle {

    public String model = "Accord";

    public int year = 2024;

    public Car(){ // 2-
        super();
        System.out.println("Sedan");
    }
    public Car(String type){ // C
        super("Honda", 2024, "Elektrikli");
        System.out.println("Sport");
    }
}

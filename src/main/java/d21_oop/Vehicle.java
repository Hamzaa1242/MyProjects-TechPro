package d21_oop;

public class Vehicle {
    /* Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
     en ustteki parent class'tan baslatilarak alta doğru calistirilir */

    // Constructor oluşturalım

    public Vehicle(){
        super(); // 3- object class ın constructor ını çağırır
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int year, String motor){
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }
}

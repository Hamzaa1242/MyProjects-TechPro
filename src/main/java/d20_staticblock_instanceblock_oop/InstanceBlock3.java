package d20_staticblock_instanceblock_oop;

public class InstanceBlock3 {

    // Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    // (Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;

    // Instance block - Bu classtan her object oluşturulduğunda çalışır
    {
        color = "Siyah"; // Her otomobil varsayılan olarak siyah renkte başlar
        fuelType = "Benzin"; // Her otomobil varsayılan yakıt türü benzin olarak ayarlanır
    }

    // Constructor - Class'ın object'leri oluşturulduğunda çalışır

    public InstanceBlock3(){
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakıt türü : " + fuelType);
    }

    // Deafult olan Siyah ve Benzin'le başlamak istemezsek, parametreli constructor kullanırız

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}

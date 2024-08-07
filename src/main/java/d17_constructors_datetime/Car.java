package d17_constructors_datetime;

public class Car {
    /*Java Object Oriented Programming bir dildir. Yani her seyi object olarak kabul eder.
       Object olustururken de iki sey dikkate alinir. Pasif ve aktif ozellikler.
       Bu gune kadar variable ve methodlar kullandik. Simdi kendi object'lerimizi olusturup kullanacagiz.
       Bunun icin class'lar olusturup, class'larimizin icine variable ve methodlar
       ekleyecegiz ki bunlardan object'ler uretebilelim.*/

    /*  1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
        2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
        main methodu oluşturmanız gerekebilir.
        3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method'lu class olur.
        Adina da "runner" eklenir. */

    // 1- Variable'lar oluşturalım (Pasif Özellikler)

    String brand = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    // 2- Method'lar olusturalim (Aktif ozellikler)

    public void action() {
        System.out.println(brand + " hızlı hareket eder");
    }
    public void stop() {
        System.out.println(brand + " güvenli bir şekilde durur");
    }

    // 3- Runnerlı classı oluşturalım

    /*6-Constructor nedir?
        Classtan object olusturmamizi saglayan bolumdur.
        Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
        Bu constructor'lara "default constructor" denir.
        default constructor ===> Car () */

    /*7- Constructor nasil olusturulur?
        Access Modifier + Class ismi + () + {}
        Kendiniz constructor'inizi olusturdugunuz zaman Java default constructor'i siler

        Method ile Constructor arasindaki fark nedir? Interview Sorusu

        1)Methodlarda return type olur, constructor'larda olmaz
        2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
        3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.(constructorlar
        objeleri başlatmak ve class'in başlatılmasını sağlamak için kullanılır.)
        4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le
        baslar

        Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object'ler olusturabiliriz

         Java'da 2 tur constructor vardir.
           1-Parametresiz (default)
              a)Otomatik uretilen (Java uretir)
              b) Kullanici tarafindan uretilen
           2- Parametreli
       */

    public Car(String brand, String model, int year, boolean hybrid) {
        this.brand = brand; // Buradaki brand i kullanma, biz parametre ile başka brand göndereceğiz
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    // 8- Biz constructor oluşturduğumuzda Java default olanı sildi, devre dışı bıraktı
    // CarRunnerdakiler bu yüzden hataya düştü

    // 12- toString methodu oluşturalım

    // 13- İki parametre kabul eden iki constructor oluşturalım

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", hybrid = " + hybrid +
                '}';
    }
}

package d22_oop;

public class Accord extends Honda{

    // 1- extends ile Honda'nın child'ı yapıldı. Accord parent'ındaki
    // engine() abstract methodunu override etmek zorundadır

    // 2- @Override yazıldı. Parenttaki engine methodu override edilecek

    // 3- Abstract silindi

    // 4- Body eklendi

    @Override
    public void engine(){
        System.out.println("Gas 2.0 Turbo");
    }
}

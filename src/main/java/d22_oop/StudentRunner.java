package d22_oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();

        // get
        System.out.println(s.getAge()); // 13
        System.out.println(s.isSuccessful()); // true

        // set
        s.setAge(25);
        System.out.println(s.getAge()); // 25
        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); // false

        // Kullanıcı bazında erişim kontrolü
        // RBAC, AOP

        // Encapsulation’da bir object olusturup,iki object gibi kullaniyoruz.
        // Kaliptan istedigimiz kadar boyle olusturabiliriz.
        // Memory problemini onler. Bircok object memoryi doldururdu.

        // getter ve setter metodlarına sahip class’lar sıkça JavaBeans olarak da adlandırılır.
        // (Java beans aslinda ozel bir class turudur.)

        // Soru 1:  encapsulation'da set ile verileri degistirebiliyoruz. constructorlar ile de degistirebiliyoruz.
        // Farki nedir?

        // Cevap : constructorlar nesne oluşturma sırasında başlangıç değerlerini atamak için kullanılırken, set
        // metodları mevcut nesne örneğindeki verileri değiştirmek için kullanılır.

        // Soru 2: set method birkac parametre alir mi?

        // Cevap : Evet, set metodları birden fazla parametre alabilir. set metodlarının amacı, sınıfın özel alanlarını
        // dışarıdan erişilebilir hale getirirken, aynı zamanda bu alanları kontrol altında tutmaktır. Dolayısıyla, bir
        // set metodu birden fazla parametre alabilir ve bu parametreleri kullanarak sınıfın özel alanlarını
        // güncelleyebilir.

        // Soru 3: encapsulation da private ile gizlenen bir veri baska package'dan set method ile degistirilebilir mi?

        // Cevap : Evet, bir private veri başka bir paketten set metodu kullanılarak değiştirilebilir. Bu, OOP'de
        // kullanılan kapsülleme (encapsulation) ilkesinin bir parçasıdır. private erişim belirleyicisi, veri üyelerinin
        // doğrudan erişimini sınırlarken, set ve get metodları gibi halka açık (public) yöntemler aracılığıyla bu
        // verilere kontrollü erişim sağlar.
    }
}

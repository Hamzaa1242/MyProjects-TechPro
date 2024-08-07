package d19_stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {
        // Student class'tan bir tane instance olusturalim

        Student ali = new Student();

        System.out.println(ali.stdName); // Ali Can
        System.out.println(ali.adress); // Istanbul // protected, aynı paketten erişilebilir
        System.out.println(ali.email); // alican@gmail.com // default, aynı paketten erişilebilir
        System.out.println(ali); // Student{stdName='Ali Can', adress='Istanbul', email='alican@gmail.com'}
    }
}

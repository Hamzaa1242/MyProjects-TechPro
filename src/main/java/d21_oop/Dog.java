package d21_oop;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("Dogs bark...");
    }

    public void eat(){
        System.out.println("Dogs eat...");
    }

    public void drink(){
        System.out.println("Dogs drink...");
    }

    public void feedWithMilk(){
        System.out.println("Dogs feed their babies with milk...");
    }

    @Override
    public Animal create(){
        return new Dog(); // Child parent'ın data tipini kullanabilir
    }

    @Override
    public int add(int a, int b){
        return a + b;
        // primitive'lerde override'da return type değiştirilemez
        // çünkü primitive'lerde parent-child ilişkisi yok
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
}

package d22_oop;

public class AudiS5 implements Engine, AC, Brake{

    // Engine interface'inden override edilenler

    @Override
    public void eco(){
        System.out.println("Audi S5 ekonomik motor kullanır");
    }

    @Override
    public void turbo(){
        System.out.println("Audi S5 turbo motor kullanır");
    }

    @Override
    public void gas(){
        System.out.println("Audi S5 benzinli motor kullanır");
    }

    // AC interface'inden override edilenler

    @Override
    public void analog(){
        System.out.println("Audi S5 analog klima kullanır");
    }

    @Override
    public void digital(){
        System.out.println("Audi S5 digital klima kullanır");
    }

    // Brake interface'inden override edilenler

    @Override
    public void abs(){
        System.out.println("Audi S5 abs fren sistemi kullanır");
    }

    @Override
    public void esp(){
        System.out.println("Audi S5 esp fren sistemi kullanır");
    }
}

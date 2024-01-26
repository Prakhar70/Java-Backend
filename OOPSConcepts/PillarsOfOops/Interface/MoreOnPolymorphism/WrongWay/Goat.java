package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.WrongWay;

public class Goat implements Animal{

    @Override
    public void move() {
        System.out.println("Goat moving");
    }

    @Override
    public void speak() {
        System.out.println("Goat speaking");
    }
    public void grazing() {
        System.out.println("Goat grazing");
    }
    
}

package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.CorrectWay;

public class Goat implements Animal, Grazeable{

    @Override
    public void move() {
        System.out.println("Goat moving");
    }

    @Override
    public void speak() {
        System.out.println("Goat speaking");
    }
    @Override
    public void grazing() {
        System.out.println("Goat grazing");
    }
    
}

package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.CorrectWay;

public class Cow implements Animal, Grazeable{

    @Override
    public void move() {
        System.out.println("Cow moving");
    }

    @Override
    public void speak() {
        System.out.println("Cow moving");
    }
    @Override
    public void grazing() {
        System.out.println("Cow grazing");
    }
    
}

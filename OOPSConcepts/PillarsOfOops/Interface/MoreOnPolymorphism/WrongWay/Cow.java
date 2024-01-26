package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.WrongWay;

public class Cow implements Animal{

    @Override
    public void move() {
        System.out.println("Cow moving");
    }

    @Override
    public void speak() {
        System.out.println("Cow moving");
    }
    public void grazing() {
        System.out.println("Cow grazing");
    }
    
}

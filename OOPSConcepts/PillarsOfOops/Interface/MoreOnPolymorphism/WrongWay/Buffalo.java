package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.WrongWay;

public class Buffalo implements Animal{

    @Override
    public void move() {
        System.out.println("Buffalo moving");
    }

    @Override
    public void speak() {
        System.out.println("Buffalo moving");
    }

    public void grazing() {
        System.out.println("Buffalo grazing");
    }
}

package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.CorrectWay;

public class Buffalo implements Animal, Grazeable{

    @Override
    public void move() {
        System.out.println("Buffalo moving");
    }

    @Override
    public void speak() {
        System.out.println("Buffalo moving");
    }

    @Override
    public void grazing() {
        System.out.println("Buffalo grazing");
    }
}

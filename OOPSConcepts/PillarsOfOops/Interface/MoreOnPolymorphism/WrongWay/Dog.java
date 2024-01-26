package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.WrongWay;

public class Dog implements Animal{

    @Override
    public void move() {
        System.out.println(" Dog moving ");
    }

    @Override
    public void speak() {
        System.out.println(" Dog speaking ");
    }

    
}

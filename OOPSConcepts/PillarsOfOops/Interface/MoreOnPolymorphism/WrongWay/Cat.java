package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.WrongWay;

public class Cat implements Animal{

    @Override
    public void move() {
        System.out.println("Cat moving");
    }
    @Override
    public void speak() {
        System.out.println("Cat speaking");
    }
    
}

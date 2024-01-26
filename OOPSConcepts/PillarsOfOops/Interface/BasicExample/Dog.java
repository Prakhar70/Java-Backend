package OOPSConcepts.PillarsOfOops.Interface.BasicExample;

public class Dog implements Animal{

    @Override
    public void move() {
       System.out.println("Dog moving");
    }

    @Override
    public void speak() {
        System.out.println("dog speaking");
        
    }
    
}

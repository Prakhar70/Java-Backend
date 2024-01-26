package OOPSConcepts.PillarsOfOops.Abstract;

public class Dog extends Animal {
    private final String breed;
    protected Dog(String name, String breed){
        super(name);
        this.breed=breed;
    }
    
    @Override
    void speak() {
       System.out.println("Dog speaking");
    }

    @Override
    void move() {
        System.out.println("Dog moving");
    }
    
}

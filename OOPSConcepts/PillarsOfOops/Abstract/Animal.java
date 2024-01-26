package OOPSConcepts.PillarsOfOops.Abstract;

public abstract class Animal {
    private final String name;
    protected Animal(String name){
        this.name=name;
    }
    public void printName(){
        System.out.println(name);
    }
    abstract void speak();
    abstract void move();
}

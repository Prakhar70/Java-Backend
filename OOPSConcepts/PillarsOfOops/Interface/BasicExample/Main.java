package OOPSConcepts.PillarsOfOops.Interface.BasicExample;

public class Main {
    public static void main(String[] args) {
        
        Animal animal;
        animal=new Cat();
        animal.move();
        animal.speak();
        animal=new Dog();
        animal.move();
        animal.speak();

    }
}

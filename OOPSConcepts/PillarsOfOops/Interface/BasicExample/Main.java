package OOPSConcepts.PillarsOfOops.Interface.BasicExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Animal animal;
        animal=new Cat();
        animal.move();
        animal.speak();
        animal=new Dog();
        animal.move();
        animal.speak();

        List<Animal> animals=new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        AnimalUtility.MakeNoise(animals);
        

    }
}

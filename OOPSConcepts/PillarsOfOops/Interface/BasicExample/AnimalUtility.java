package OOPSConcepts.PillarsOfOops.Interface.BasicExample;

import java.util.List;

public class AnimalUtility {

    public static void MakeNoise (List<Animal> animals) {
        for(Animal animal:animals){
            animal.speak();
        }
        
    }
}

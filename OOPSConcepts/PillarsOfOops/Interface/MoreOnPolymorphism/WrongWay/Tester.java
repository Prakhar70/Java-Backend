package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.WrongWay;

import java.util.List;

public class Tester {
    public static void grazeAll(List<Animal> animals) {
        for(Animal animal: animals){
            if (animal instanceof Cow){
                ((Cow)animal).grazing();
            }
            else if (animal instanceof Buffalo){
                ((Buffalo)animal).grazing();
            }
            else if (animal instanceof Goat){
                ((Goat)animal).grazing();
            }
        }
    }
}

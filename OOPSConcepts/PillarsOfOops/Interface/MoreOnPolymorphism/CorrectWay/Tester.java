package OOPSConcepts.PillarsOfOops.Interface.MoreOnPolymorphism.CorrectWay;

import java.util.List;

public class Tester {
    public static void grazeAll(List<Grazeable> animals) {
        for(Grazeable animal: animals){
            animal.grazing();
        }
    }
}

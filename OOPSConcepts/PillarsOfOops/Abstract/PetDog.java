package OOPSConcepts.PillarsOfOops.Abstract;

public class PetDog extends Dog{

    private final int cuteness_score;
    protected PetDog(String name, String breed , int cuteness_score) {
        super(name, breed);
        this.cuteness_score=cuteness_score;
    }

}

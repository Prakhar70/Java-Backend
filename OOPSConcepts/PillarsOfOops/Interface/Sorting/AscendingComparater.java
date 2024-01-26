package OOPSConcepts.PillarsOfOops.Interface.Sorting;

public class AscendingComparater implements Comparater{

    @Override
    public boolean compare(int a, int b) {
        return a<=b;
    }
    
}

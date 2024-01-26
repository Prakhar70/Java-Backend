package OOPSConcepts.PillarsOfOops.Interface.Sorting;

public class SortingUtilityTester {
    public static void main(String[] args) {
        int[] arr= {-2,1,3,4,3,5,4};
        SortingUtility.sort(arr, new AscendingComparater());
        for(int ele: arr){
            System.out.println(ele);
        }
        SortingUtility.sort(arr, (a,b)->{return a>=b;});
            
    }
}

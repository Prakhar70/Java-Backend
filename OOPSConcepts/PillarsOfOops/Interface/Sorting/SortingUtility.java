package OOPSConcepts.PillarsOfOops.Interface.Sorting;

public class SortingUtility {
    public static void sort(int[] arr, Comparater comparater) {
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && comparater.compare(arr[j-1], arr[j])){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
}

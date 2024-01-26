package OOPSConcepts.ImportantConstructs.Static;

public class Challenge {
    public static int cnt;
    static{
        cnt=0;
    }
    Challenge(){
        if (cnt > 5){
            System.out.println("Number of instance exceed 5");
        }
        cnt++;
        
    }
}

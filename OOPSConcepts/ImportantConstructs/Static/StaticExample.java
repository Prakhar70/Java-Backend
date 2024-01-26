package OOPSConcepts.ImportantConstructs.Static;

public class StaticExample {
    String path;
    double size;
    static int cnt;
    static {
        cnt=0;
    }
    public StaticExample() {
        this.path="random/path";
        this.size=10;
        cnt=1;//static member can be called from non static method
    }

}

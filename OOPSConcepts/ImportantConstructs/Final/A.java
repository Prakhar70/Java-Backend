package OOPSConcepts.ImportantConstructs.Final;

public class A {
    final int a;
    final int b;
    final C c;

    public A() {
        this.a = 10;
        this.b = 20;
        this.c = new C(a+10, b+20);
    }
    // public int setA(int a){
    //     this.a=a;
    // }
    //The final field A.a cannot be assigned

}

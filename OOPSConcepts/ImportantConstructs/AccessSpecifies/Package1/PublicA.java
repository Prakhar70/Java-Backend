package OOPSConcepts.ImportantConstructs.AccessSpecifies.Package1;

public class PublicA{
    public int a;
    public int b;

    public PublicA() {
        this.a=0;
        this.b=0;
    }
    public void MethodToTestProtected (){

        ProtectedC prot_c=new ProtectedC();
        prot_c.e=1;
        prot_c.f=2;//protected works for classes in same package
    }
    public void MethodToTestDefault (){

        DefaultD def_c=new DefaultD();
        def_c.g=1;
        def_c.h=2;//protected works for classes in same package
    }
}
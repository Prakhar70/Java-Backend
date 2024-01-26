
package OOPSConcepts.ImportantConstructs.AccessSpecifies.Package2;

import OOPSConcepts.ImportantConstructs.AccessSpecifies.Package1.PublicA;

import OOPSConcepts.ImportantConstructs.AccessSpecifies.Package1.PrivateB;
import OOPSConcepts.ImportantConstructs.AccessSpecifies.Package1.ProtectedC;

public class Test extends ProtectedC {
    public Test() {
        super();

    }
    public void main(String[] args) {
        PublicA pub_a=new PublicA();

        pub_a.a=10;

        PrivateB pub_b=new PrivateB();
        //pub_b.a=11;  this will lead to compilation error

       

        this.e=12;
        this.f=13;
        // ProtectedC prot_c=new ProtectedC();
        // prot_c.e=12;


        




    }
}

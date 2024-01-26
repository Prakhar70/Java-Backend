package OOPSConcepts.ImportantConstructs.AccessSpecifies.Package2;

import OOPSConcepts.ImportantConstructs.AccessSpecifies.Package1.DefaultD;

class TestDefault extends DefaultD{
    
    public int a;
    public int b;
    public TestDefault() {
        this.a=10;
        this.b=122;
        //this.g=122;//cannot g is not visible
        
    }
    

}
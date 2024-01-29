package DesignPattern.FatoryDesignPattern.Lec1;

public class Expresso implements Coffee{

    @Override
    public void brew() {
        System.out.println("brewing Expresso");
    }

    @Override
    public void boil() {
        System.out.println("boiling Expresso");
    }
}

package DesignPattern.FatoryDesignPattern.Lec1;

public class Cappucino implements Coffee{

    @Override
    public void brew() {
        System.out.println("brewing Cappucino");
    }

    @Override
    public void boil() {
        System.out.println("boiling Cappucino");
    }
    
}

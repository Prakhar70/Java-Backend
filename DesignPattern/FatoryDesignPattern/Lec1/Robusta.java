package DesignPattern.FatoryDesignPattern.Lec1;

public class Robusta implements Coffee{

    @Override
    public void brew() {
        System.out.println("brewing Robusta");
    }

    @Override
    public void boil() {
        System.out.println("boiling Robusta");
    }
    
}

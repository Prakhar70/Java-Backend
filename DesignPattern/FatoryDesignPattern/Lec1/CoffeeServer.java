package DesignPattern.FatoryDesignPattern.Lec1;

public class CoffeeServer {
    public void serve(String coffeeType){
        Coffee coffee = null;
        if(coffeeType.equals("Expresso")){
            coffee=new Expresso();
        }
        else if(coffeeType.equals("Robusta")){
            coffee=new Robusta();
        }
        else if(coffeeType.equals("Cappucino")){
            coffee=new Cappucino();
        }
        coffee.brew();
        coffee.boil();
    }
}

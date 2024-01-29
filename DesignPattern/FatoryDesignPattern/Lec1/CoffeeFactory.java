package DesignPattern.FatoryDesignPattern.Lec1;

public class CoffeeFactory implements AbstractCoffeeFactory{

    public Coffee getCoffee (String coffeeType){

        Coffee coffee = null;
        if(coffeeType.equals ("Expresso")){

            coffee = new Expresso ();
        }
        else if (coffeeType.equals("Robusta")){

            coffee = new Robusta ();
        }
        else if (coffeeType.equals ("Cappucino")){

            coffee=new Cappucino ();
        }
        return coffee;
    }
}

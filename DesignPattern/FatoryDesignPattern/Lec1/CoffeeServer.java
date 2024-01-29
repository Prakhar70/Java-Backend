package DesignPattern.FatoryDesignPattern.Lec1;

public class CoffeeServer {
    
    private final AbstractCoffeeFactory coffeeFactory;
    public CoffeeServer(AbstractCoffeeFactory coffeeFactory){

        this.coffeeFactory=coffeeFactory;
    }
    public void serve(String coffeeType){
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);
        coffee.brew();
        coffee.boil();
    }
}

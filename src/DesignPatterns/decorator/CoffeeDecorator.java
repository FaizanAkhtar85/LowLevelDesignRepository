package DesignPatterns.decorator;

public class CoffeeDecorator implements Coffee{
    Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee){
        this.decoratorCoffee = decoratorCoffee;
        System.out.println("CoffeeDecorator Constructor");
    }

    @Override
    public String description() {
        System.out.println("CoffeeDecorator description()");
        return decoratorCoffee.description();
    }

    @Override
    public double cost() {
        System.out.println("CoffeeDecorator cost()");
        return decoratorCoffee.cost();
    }
}

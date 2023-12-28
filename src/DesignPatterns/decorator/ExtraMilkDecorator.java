package DesignPatterns.decorator;

public class ExtraMilkDecorator extends CoffeeDecorator{
    public ExtraMilkDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
        System.out.println("ExtraMilkDecorator Constructor");
    }
    @Override
    public String description() {
        System.out.println("ExtraMilkDecorator description()");
        return super.description() + ", with Milk";
    }

    @Override
    public double cost() {
        System.out.println("ExtraMilkDecorator cost()");
        return super.cost() + 20.0;
    }
}

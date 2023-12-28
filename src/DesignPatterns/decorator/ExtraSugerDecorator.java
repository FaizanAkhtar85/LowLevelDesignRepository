package DesignPatterns.decorator;

public class ExtraSugerDecorator extends CoffeeDecorator{
    public ExtraSugerDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
        System.out.println("ExtraSugerDecorator Constructor");
    }
    @Override
    public String description() {
        System.out.println("ExtraSugerDecorator description()");
        return super.description() + ", with extra Suger";
    }

    @Override
    public double cost() {
        System.out.println("ExtraSugerDecorator cost()");
        return super.cost() + 10.0;
    }
}

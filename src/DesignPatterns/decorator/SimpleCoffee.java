package DesignPatterns.decorator;

public class SimpleCoffee implements  Coffee{

    @Override
    public String description() {
        System.out.println("SimpleCoffee description()");
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        System.out.println("SimpleCoffee cost()");
        return 100.0;
    }
}

package DesignPatterns.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description());
        System.out.println(coffee.cost());
        System.out.println("*****************");
        Coffee extraMilkCoffee = new ExtraMilkDecorator(new SimpleCoffee());
        System.out.println(extraMilkCoffee.description());
        System.out.println(extraMilkCoffee.cost());
        System.out.println("*****************");
        Coffee extraMilkCoffeeWithExtraSuger = new ExtraSugerDecorator(new ExtraMilkDecorator((new SimpleCoffee())));
        System.out.println(extraMilkCoffeeWithExtraSuger.description());
        System.out.println(extraMilkCoffeeWithExtraSuger.cost());
    }
}

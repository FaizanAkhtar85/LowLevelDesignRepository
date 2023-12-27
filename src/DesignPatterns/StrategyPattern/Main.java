package DesignPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart();
        cart.setPaymentStrategy(new DebitCardPaymentStrategy("1234-7894-4325-8956"));
        cart.checkOut(10000.0);
        cart.setPaymentStrategy(new CreditCardPaymentStrategy("1234-7894-4325-8956"));
        cart.checkOut(20000.0);
        cart.setPaymentStrategy(new UPIPaymentStrategy("fakhjyd145@"));
        cart.checkOut(50000.0);

    }
}

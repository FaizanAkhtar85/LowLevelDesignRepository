package DesignPatterns.StrategyPattern;

public class ShopingCart {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(double amount){
        if(null!= paymentStrategy){
            paymentStrategy.processPayment(amount);
        }
        else{
            System.out.println("Kinldy select your payment strategy...");
        }
    }
}

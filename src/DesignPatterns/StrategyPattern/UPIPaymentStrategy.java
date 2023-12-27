package DesignPatterns.StrategyPattern;

public class UPIPaymentStrategy implements PaymentStrategy{
    public String upiNumber;

    public UPIPaymentStrategy(String upiNumber){
        this.upiNumber = upiNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI("+ upiNumber+") Payment Success with amount "+amount);
    }
}

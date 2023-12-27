package DesignPatterns.StrategyPattern;

public class CreditCardPaymentStrategy implements  PaymentStrategy{
    public String creditCardNumber;

    public CreditCardPaymentStrategy(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card("+creditCardNumber +") Payment Success with amount "+amount);
    }
}

package DesignPatterns.StrategyPattern;

public class DebitCardPaymentStrategy implements PaymentStrategy{
    public String debitCardNumber;

    public DebitCardPaymentStrategy(String debitCardNumber){
        this.debitCardNumber = debitCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Debit Card("+ debitCardNumber +") Payment Success with amount "+amount);
    }
}

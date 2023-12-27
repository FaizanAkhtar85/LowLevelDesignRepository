package DesignPatterns.templateDesignPattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void debitAmount();
    public abstract void calculatePlatformFee();
    public abstract void creditAmount();

    public final void sendMoney(){

        validateRequest();
        debitAmount();
        calculatePlatformFee();
        creditAmount();

    }
}


package DesignPatterns.templateDesignPattern;

public class PayToMarchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic for PayToMarchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount logic for PayToMarchant");
    }

    @Override
    public void calculatePlatformFee() {
        System.out.println("Calculate Platform fee logic for PayToMarchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount logic for PayToMarchant");
    }
}

package DesignPatterns.templateDesignPattern;

public class PayToFriend  extends  PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic for PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount logic for PayToFriend");
    }

    @Override
    public void calculatePlatformFee() {
        System.out.println("Calculate Platform fee logic for PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit Amount logic for PayToFriend");
    }
}

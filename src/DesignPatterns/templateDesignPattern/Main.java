package DesignPatterns.templateDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow1 = new PayToFriend();
        PaymentFlow paymentFlow2 = new PayToMarchant();
        System.out.println("Steps for payment flow in series for PayToFriend....................");
        paymentFlow1.sendMoney();
        System.out.println("Steps for payment flow in series for PayToMarchant......................");
        paymentFlow2.sendMoney();
    }
}

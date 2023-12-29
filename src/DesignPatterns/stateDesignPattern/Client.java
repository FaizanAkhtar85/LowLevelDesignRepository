package DesignPatterns.stateDesignPattern;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
    }
}

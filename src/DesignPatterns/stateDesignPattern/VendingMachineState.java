package DesignPatterns.stateDesignPattern;

public interface VendingMachineState {
    void insertCoin();
    void selectItem();
    void dispenseItem();
}

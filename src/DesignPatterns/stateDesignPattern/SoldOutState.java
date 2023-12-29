package DesignPatterns.stateDesignPattern;

public class SoldOutState implements VendingMachineState{

    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;

    }
    @Override
    public void insertCoin() {
        System.out.println("Please wait. Item dispensing...");
    }

    @Override
    public void selectItem() {
        System.out.println("Item already selected");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed");
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}

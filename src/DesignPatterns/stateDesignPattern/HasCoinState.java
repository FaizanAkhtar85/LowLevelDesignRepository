package DesignPatterns.stateDesignPattern;

public class HasCoinState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;

    }

    @Override
    public void insertCoin() {
        System.out.println("coin already inserted");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected");
        vendingMachine.setState(vendingMachine.getDispanseState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("kindly select item first");
    }
}

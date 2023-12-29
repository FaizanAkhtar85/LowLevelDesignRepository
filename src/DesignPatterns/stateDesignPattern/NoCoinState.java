package DesignPatterns.stateDesignPattern;

public class NoCoinState implements VendingMachineState {
    private VendingMachine vendingMachine;

   public NoCoinState(VendingMachine vendingMachine){
       this.vendingMachine = vendingMachine;

    }
    @Override
    public void insertCoin() {
        System.out.println("coin inserted");
       vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void selectItem() {
        System.out.println("kindly insert coin first");

    }

    @Override
    public void dispenseItem() {
        System.out.println("kindly insert coin first");
    }
}

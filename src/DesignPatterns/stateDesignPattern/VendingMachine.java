package DesignPatterns.stateDesignPattern;

public class VendingMachine {

    private VendingMachineState noCoinState;
    private VendingMachineState hasCoinState;
    private VendingMachineState soldOutState;
    private VendingMachineState currentState;

    public VendingMachine(){
        this.noCoinState = new NoCoinState(this);
        this.hasCoinState = new HasCoinState(this);
        this.soldOutState = new SoldOutState(this);
        currentState = noCoinState;
    }


    void setState(VendingMachineState vendingMachineState){
       this.currentState = vendingMachineState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public VendingMachineState getIdleState() {
        return noCoinState;
    }

    public VendingMachineState getHasCoinState() {
        return hasCoinState;
    }

    public VendingMachineState getDispanseState() {
        return soldOutState;
    }
}

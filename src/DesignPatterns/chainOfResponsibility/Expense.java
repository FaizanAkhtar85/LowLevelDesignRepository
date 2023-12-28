package DesignPatterns.chainOfResponsibility;

public class Expense {
    private double amount;
    private String purpose;

    public Expense(double amount, String purpose){
        this.amount = amount;
        this.purpose = purpose;
    }
    public double getAmount(){
        return amount;
    }
    public String getPurpose(){
        return purpose;
    }
}

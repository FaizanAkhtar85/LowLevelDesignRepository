package DesignPatterns.chainOfResponsibility;

public class Director implements Approver{
    @Override
    public void processExpense(Expense expense) {
        System.out.println("Director approved expense amount "+ expense.getAmount()+" for " + expense.getPurpose());
    }

    @Override
    public void setNextApprover(Approver nextApprover) {
        // top authority
    }
}

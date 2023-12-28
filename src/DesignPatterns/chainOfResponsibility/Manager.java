package DesignPatterns.chainOfResponsibility;

public class Manager implements Approver{
    Approver nextApprover;

    @Override
    public void processExpense(Expense expense) {
        if(expense.getAmount() <= 5000){
            System.out.println("Manager approved expense amount "+ expense.getAmount()+" for " + expense.getPurpose());
        }
        else if (null != nextApprover){
            nextApprover.processExpense(expense);
        }
    }

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}

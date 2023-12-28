package DesignPatterns.chainOfResponsibility;

public class TeamLead implements Approver{
    Approver nextApprover;
    @Override
    public void processExpense(Expense expense) {
        if(expense.getAmount() <= 1000){
            System.out.println("Team Lead approved expense amount"+ expense.getAmount()+" for " + expense.getPurpose());
        }
        else if(null != nextApprover){
            nextApprover.processExpense(expense);
        }
    }

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}

package DesignPatterns.chainOfResponsibility;

public interface Approver {
    void processExpense(Expense expense);
    void setNextApprover(Approver nextApprover);
}

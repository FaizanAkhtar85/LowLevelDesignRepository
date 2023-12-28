package DesignPatterns.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Expense expense1 = new Expense(800,"office supplies items");
        Expense expense2 = new Expense(3500,"Business trip");
        Expense expense3 = new Expense(20000,"Equipments items purchase");

        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);

        teamLead.processExpense(expense1);
        teamLead.processExpense(expense2);
        teamLead.processExpense(expense3);
    }
}

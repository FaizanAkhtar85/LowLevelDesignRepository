package DesignPatterns.abstarctFactoryPatteren;

public class HomeLoan implements Loan{
    @Override
    public void applyLoan() {
        System.out.println("Home loan applied");
    }
}

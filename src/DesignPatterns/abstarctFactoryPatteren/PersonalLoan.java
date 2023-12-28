package DesignPatterns.abstarctFactoryPatteren;

public class PersonalLoan implements Loan{
    @Override
    public void applyLoan() {
        System.out.println("Person loan applied");
    }
}

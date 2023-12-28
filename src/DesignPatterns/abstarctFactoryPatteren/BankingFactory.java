package DesignPatterns.abstarctFactoryPatteren;

public interface BankingFactory {
    Account createAccount();
    Loan createLoan();
}

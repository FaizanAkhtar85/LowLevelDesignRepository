package DesignPatterns.abstarctFactoryPatteren;

public class CorporateBankingFactory implements BankingFactory{
    @Override
    public Account createAccount() {
        return new CurrentAccount();
    }

    @Override
    public Loan createLoan() {
        return new HomeLoan();
    }
}

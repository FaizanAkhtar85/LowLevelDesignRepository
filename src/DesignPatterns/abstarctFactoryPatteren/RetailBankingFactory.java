package DesignPatterns.abstarctFactoryPatteren;

public class RetailBankingFactory implements BankingFactory{
    @Override
    public Account createAccount() {
        return new SavingAccount();
    }

    @Override
    public Loan createLoan() {
        return new PersonalLoan();
    }
}

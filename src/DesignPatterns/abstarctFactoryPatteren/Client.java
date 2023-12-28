package DesignPatterns.abstarctFactoryPatteren;

public class Client {
    public static void main(String[] args) {
        BankingFactory retailBankingFactory = new RetailBankingFactory();
        Account retailAccount = retailBankingFactory.createAccount();
        Loan retailLoan = retailBankingFactory.createLoan();
        retailAccount.createAccount();
        retailLoan.applyLoan();
        System.out.println("************************");
        BankingFactory corporateBankingFactory = new CorporateBankingFactory();
        Account corporateAccount = corporateBankingFactory.createAccount();
        Loan corporateLoan = corporateBankingFactory.createLoan();
        corporateAccount.createAccount();
        corporateLoan.applyLoan();


    }

}

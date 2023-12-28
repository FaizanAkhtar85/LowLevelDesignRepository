package DesignPatterns.abstarctFactoryPatteren;

public class SavingAccount implements Account{
    @Override
    public void createAccount() {
        System.out.println("Saving Account created");
    }
}

package DesignPatterns.abstarctFactoryPatteren;

public class CurrentAccount implements Account{
    @Override
    public void createAccount() {
        System.out.println("Current Account created");
    }
}

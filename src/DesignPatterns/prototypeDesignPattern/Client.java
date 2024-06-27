package DesignPatterns.prototypeDesignPattern;

public class Client {
    public static void main(String[] args) {
        Person originalPerson = new Person("Alize","New York");
        Person clonedPerson = (Person)originalPerson.clone();

        System.out.println("Original Person:");
        originalPerson.displayDetails();

        System.out.println("\nCloned Person:");
        clonedPerson.displayDetails();
    }
}

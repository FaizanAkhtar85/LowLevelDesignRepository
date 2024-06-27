package DesignPatterns.prototypeDesignPattern;

public class Person implements Cloneable{

    private String name;
    private String address;

    public Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    @Override
    public Cloneable clone() {
        return new Person(name,address);
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Address: " + address);
    }
}

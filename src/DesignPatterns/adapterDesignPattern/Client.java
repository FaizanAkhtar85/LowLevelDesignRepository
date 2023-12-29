package DesignPatterns.adapterDesignPattern;

import DesignPatterns.adapterDesignPattern.adaptee.TempratureInCelsiusImpl;
import DesignPatterns.adapterDesignPattern.adapter.TempratureInFahrenheit;
import DesignPatterns.adapterDesignPattern.adapter.TempratureInFahrenheitImpl;

public class Client {
    public static void main(String[] args) {
        TempratureInFahrenheit tempratureInFahrenheit = new TempratureInFahrenheitImpl(new TempratureInCelsiusImpl());
        System.out.println(tempratureInFahrenheit.tempratureInFahrenheit());
    }
}

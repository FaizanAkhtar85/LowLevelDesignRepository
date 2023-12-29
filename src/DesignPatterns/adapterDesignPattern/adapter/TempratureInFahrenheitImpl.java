package DesignPatterns.adapterDesignPattern.adapter;

import DesignPatterns.adapterDesignPattern.adaptee.TempratureInCelsius;
import DesignPatterns.adapterDesignPattern.adaptee.TempratureInCelsiusImpl;

public class TempratureInFahrenheitImpl implements TempratureInFahrenheit{

TempratureInCelsius tempratureInCelsius;

public TempratureInFahrenheitImpl(TempratureInCelsius tempratureInCelsius){
    this.tempratureInCelsius = tempratureInCelsius;
}

    @Override
    public double tempratureInFahrenheit() {

        return (tempratureInCelsius.getTempratureInCelsius() * 9/5) + 32;
    }
}

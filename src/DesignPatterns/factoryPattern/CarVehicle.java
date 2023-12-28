package DesignPatterns.factoryPattern;

public class CarVehicle implements Vehicle{
    @Override
    public void manufacture() {
        System.out.println("Car Vehicle manufecturing...");
    }
}

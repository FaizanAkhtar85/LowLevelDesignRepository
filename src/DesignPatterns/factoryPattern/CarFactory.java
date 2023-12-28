package DesignPatterns.factoryPattern;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle craeteVehicle() {
        return new CarVehicle();
    }
}

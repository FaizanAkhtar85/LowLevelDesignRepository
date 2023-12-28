package DesignPatterns.factoryPattern;

public class MoterCycleFactory implements VehicleFactory{
    @Override
    public Vehicle craeteVehicle() {
        return new MoterCycleVehicle();
    }
}

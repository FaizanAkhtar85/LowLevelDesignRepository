package DesignPatterns.factoryPattern;

public class Client {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle vehicle1 = carFactory.craeteVehicle();
        vehicle1.manufacture();
        VehicleFactory motercycleFactory = new MoterCycleFactory();
        Vehicle vehicle2 = motercycleFactory.craeteVehicle();
        vehicle2.manufacture();
    }
}

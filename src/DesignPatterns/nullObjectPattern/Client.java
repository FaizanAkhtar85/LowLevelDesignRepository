package DesignPatterns.nullObjectPattern;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("car");
        System.out.println("vehicle fuel tank capacity is: "+vehicle1.fuelTankcapacity());
        System.out.println("vehicle fuel tank capacity is: "+vehicle1.seatingCapacity());
        Vehicle vehicle2 = VehicleFactory.getVehicle("bike");
        System.out.println("vehicle fuel tank capacity is: "+vehicle2.fuelTankcapacity());
        System.out.println("vehicle fuel tank capacity is: "+vehicle2.seatingCapacity());
    }
}

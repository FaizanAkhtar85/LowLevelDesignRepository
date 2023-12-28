package DesignPatterns.nullObjectPattern;

public class VehicleFactory {
    Vehicle vehicle;

    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("car")){
            return new Car();
        }
        else{
            return new NullVehicle();
        }
    }
}

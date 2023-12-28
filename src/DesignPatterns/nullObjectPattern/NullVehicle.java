package DesignPatterns.nullObjectPattern;

public class NullVehicle implements Vehicle{
    @Override
    public int seatingCapacity() {
        return 0;
    }

    @Override
    public int fuelTankcapacity() {
        return 0;
    }
}

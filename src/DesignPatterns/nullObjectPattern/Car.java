package DesignPatterns.nullObjectPattern;

public class Car implements Vehicle{
    @Override
    public int seatingCapacity() {
        return 5;
    }

    @Override
    public int fuelTankcapacity() {
        return 10;
    }
}

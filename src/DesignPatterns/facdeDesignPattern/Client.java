package DesignPatterns.facdeDesignPattern;

public class Client {
    public static void main(String[] args) {
        IgnitionSystem ignitionSystem = new IgnitionSystem();
        FuelInjectionSystem fuelInjectionSystem = new FuelInjectionSystem();
        CoolingSystem coolingSystem = new CoolingSystem();
        AirConditioning airConditioning = new AirConditioning();
        Lights lights = new Lights();
        Transmission transmission = new Transmission();

        CarEngineFacade carEngine = new CarEngineFacade(ignitionSystem, fuelInjectionSystem, coolingSystem
                                    , lights, transmission, airConditioning);

        // Starting the car engine
        carEngine.startCar();

        System.out.println("\nStopping the car engine...\n");

        // Stopping the car engine
        carEngine.stopCar();
    }
}

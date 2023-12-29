package DesignPatterns.facdeDesignPattern;

public class CarEngineFacade {
    private IgnitionSystem ignitionSystem;
    private FuelInjectionSystem fuelInjectionSystem;
    private CoolingSystem coolingSystem;
    private Lights lights;
    private Transmission transmission;
    private AirConditioning airConditioning;

    public CarEngineFacade(IgnitionSystem ignitionSystem, FuelInjectionSystem fuelInjectionSystem, CoolingSystem coolingSystem,
                           Lights lights, Transmission transmission, AirConditioning airConditioning) {
        this.ignitionSystem = ignitionSystem;
        this.fuelInjectionSystem = fuelInjectionSystem;
        this.coolingSystem = coolingSystem;
        this.lights = lights;
        this.transmission = transmission;
        this.airConditioning = airConditioning;
    }
    void startCar() {
        System.out.println("Starting the car...");

        ignitionSystem.ignite();
        fuelInjectionSystem.injectFuel();
        coolingSystem.startCooling();
        lights.turnOn();
        transmission.shiftGear(1); // Assume starting in first gear
        airConditioning.turnOn();
    }

    // Method to stop the car and turn off subsystems
    void stopCar() {
        System.out.println("Stopping the car...");

        ignitionSystem.turnOff();
        fuelInjectionSystem.stopInjection();
        coolingSystem.stopCooling();
        lights.turnOff();
        transmission.park();
        airConditioning.turnOff();
    }
}

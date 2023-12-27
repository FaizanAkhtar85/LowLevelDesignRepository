package DesignPatterns.observerPattern;

public class MobileDisplay implements Observer{

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        displayWaetherData();
    }

    private void displayWaetherData() {
        System.out.println("Weather Data on MobileDisplay : temperature["+temperature+"] humidity ["+humidity+"] pressure["+pressure+"]");
    }
}

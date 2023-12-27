package DesignPatterns.observerPattern;

public class ForcastDisplay implements  Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        displayWeatherData();
    }

    private void displayWeatherData() {
        System.out.println("Weather Data on ForcastDisplay : temperature["+temperature+"] humidity ["+humidity+"] pressure["+pressure+"]");
    }
}

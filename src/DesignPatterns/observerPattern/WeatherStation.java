package DesignPatterns.observerPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer observer1 = new MobileDisplay();
        Observer observer2 = new ForcastDisplay();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.setMeasurements(80, 65, 30.4f);
        subject.setMeasurements(82, 70, 29.4f);
        subject.setMeasurements(85, 75, 32.4f);
    }
}

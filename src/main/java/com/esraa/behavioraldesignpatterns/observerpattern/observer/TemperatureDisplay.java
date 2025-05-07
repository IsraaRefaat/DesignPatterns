package com.esraa.behavioraldesignpatterns.observerpattern.observer;

import com.esraa.behavioraldesignpatterns.observerpattern.observable.WeatherStation;

public class TemperatureDisplay implements Observer, Display {

    private final WeatherStation subject;
    private int temperature;

    public TemperatureDisplay(WeatherStation subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.temperature = subject.getTemperature();
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temperature);
    }
}

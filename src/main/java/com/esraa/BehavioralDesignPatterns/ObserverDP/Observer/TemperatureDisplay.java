package com.esraa.BehavioralDesignPatterns.ObserverDP.Observer;

import com.esraa.BehavioralDesignPatterns.ObserverDP.Observable.WeatherStation;

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

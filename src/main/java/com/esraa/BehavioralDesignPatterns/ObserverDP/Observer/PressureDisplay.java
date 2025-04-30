package com.esraa.BehavioralDesignPatterns.ObserverDP.Observer;

import com.esraa.BehavioralDesignPatterns.ObserverDP.Observable.WeatherStation;

public class PressureDisplay implements Observer, Display {
    private final WeatherStation subject;
    private int pressure;

    public PressureDisplay(WeatherStation subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.pressure = subject.getPressure();
    }

    @Override
    public void display() {
        System.out.println("Pressure: " + pressure);
    }


}

package com.esraa.behavioraldesignpatterns.observerpattern.observer;

import com.esraa.behavioraldesignpatterns.observerpattern.observable.WeatherStation;

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

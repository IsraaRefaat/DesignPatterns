package com.esraa.BehavioralDesignPatterns.ObserverDP.Observable;

import com.esraa.BehavioralDesignPatterns.ObserverDP.Observer.Observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private final ArrayList<Observer> observers = new ArrayList<Observer>();
    int temperature;
    int humidity;
    int pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}

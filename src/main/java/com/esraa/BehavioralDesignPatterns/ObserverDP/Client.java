package com.esraa.BehavioralDesignPatterns.ObserverDP;

import com.esraa.BehavioralDesignPatterns.ObserverDP.Observable.WeatherStation;
import com.esraa.BehavioralDesignPatterns.ObserverDP.Observer.PressureDisplay;
import com.esraa.BehavioralDesignPatterns.ObserverDP.Observer.TemperatureDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        PressureDisplay pressureDisplay = new PressureDisplay(ws);
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(ws);
        ws.registerObserver(pressureDisplay);
        ws.registerObserver(temperatureDisplay);
        ws.setPressure(100);
        ws.setTemperature(50);
        ws.notifyObservers();
        pressureDisplay.display();
        temperatureDisplay.display();

        ws.setPressure(200);
        ws.setTemperature(20);
        ws.notifyObservers();
        pressureDisplay.display();
        temperatureDisplay.display();




    }
}

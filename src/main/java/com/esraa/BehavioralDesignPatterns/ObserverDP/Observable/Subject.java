package com.esraa.BehavioralDesignPatterns.ObserverDP.Observable;

import com.esraa.BehavioralDesignPatterns.ObserverDP.Observer.Observer;

//Observable
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

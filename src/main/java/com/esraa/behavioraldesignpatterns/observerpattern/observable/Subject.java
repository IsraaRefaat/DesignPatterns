package com.esraa.behavioraldesignpatterns.observerpattern.observable;

import com.esraa.behavioraldesignpatterns.observerpattern.observer.Observer;

//Observable
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

package org.example.designpattern.observerdp.observer;

public class InAppAlertObserver implements IObservers {
    @Override
    public void update() {
        System.out.println("In app notification sent to registered users");
    }

    @Override
    public String getType() {
        return "In App";
    }
}

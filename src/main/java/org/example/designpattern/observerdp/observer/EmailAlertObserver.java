package org.example.designpattern.observerdp.observer;

public class EmailAlertObserver implements IObservers {
    @Override
    public void update() {
        System.out.println("Email sent to registered users");
    }

    @Override
    public String getType() {
        return "Email";
    }
}

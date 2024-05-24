package org.example.designpattern.observerdp.observer;

public class TextMessageAlertObserver implements IObservers {
    @Override
    public void update() {
        System.out.println("Text message sent to registered users");
    }

    @Override
    public String getType() {
        return "Text Message";
    }
}

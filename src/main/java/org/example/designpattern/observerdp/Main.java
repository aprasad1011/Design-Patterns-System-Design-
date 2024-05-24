package org.example.designpattern.observerdp;

import org.example.designpattern.observerdp.observable.IStockObservable;
import org.example.designpattern.observerdp.observable.IphoneStockObservable;
import org.example.designpattern.observerdp.observer.EmailAlertObserver;
import org.example.designpattern.observerdp.observer.InAppAlertObserver;
import org.example.designpattern.observerdp.observer.TextMessageAlertObserver;

public class Main {

    public static void main(String[] args) {
        IStockObservable iphoneStockObservable = new IphoneStockObservable();
        iphoneStockObservable.addStock(2);

        EmailAlertObserver emailAlertObserver = new EmailAlertObserver();
        iphoneStockObservable.addObserver(emailAlertObserver);
        iphoneStockObservable.addObserver(new TextMessageAlertObserver());
        iphoneStockObservable.addObserver(new InAppAlertObserver());

        iphoneStockObservable.addStock(0);
        iphoneStockObservable.addStock(2);
        iphoneStockObservable.addStock(4);

        iphoneStockObservable.removeObserver(emailAlertObserver);

        iphoneStockObservable.addStock(0);
        iphoneStockObservable.addStock(2);
    }
}

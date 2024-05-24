package org.example.designpattern.observerdp.observable;

import org.example.designpattern.observerdp.observer.IObservers;

public interface IStockObservable {

    void addObserver(IObservers observer);
    void removeObserver(IObservers observer);
    void notifyStockUpdate();

    void addStock(int count);

    int getData();

}

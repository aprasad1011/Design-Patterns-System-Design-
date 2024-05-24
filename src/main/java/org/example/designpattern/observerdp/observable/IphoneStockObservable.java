package org.example.designpattern.observerdp.observable;

import org.example.designpattern.observerdp.observer.IObservers;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements IStockObservable {

    List<IObservers> observers = new ArrayList<>();

    int stockCount = 0;

    @Override
    public void addObserver(IObservers observer) {
        System.out.printf("New Observer added : %s\n", observer.getType());
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObservers observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyStockUpdate() {
        for (IObservers observer : observers) {
            observer.update();
        }
    }

    @Override
    public void addStock(int count) {
        System.out.printf("New stock added. Previous count %d. New count %d%n \n", stockCount, count);
        if(stockCount == 0 && count > 0){
            notifyStockUpdate();
        }
        stockCount = count;
    }

    @Override
    public int getData() {
        return stockCount;
    }
}

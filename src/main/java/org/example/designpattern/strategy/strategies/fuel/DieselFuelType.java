package org.example.designpattern.strategy.strategies.fuel;

public class DieselFuelType implements IFuelType {
    @Override
    public void printFuelType() {
        System.out.println("Fuel type is Diesel.");
    }
}

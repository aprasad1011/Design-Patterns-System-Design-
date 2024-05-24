package org.example.designpattern.strategy.strategies.drive;

public class NormalDriveStrategy implements IDriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is normal drive strategy. Max speed is 100.");
    }
}

package org.example.designpattern.strategy.strategies.drive;

public class SportsDriveStrategy implements IDriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is Sports drive strategy. Max speed is 180.");
    }
}

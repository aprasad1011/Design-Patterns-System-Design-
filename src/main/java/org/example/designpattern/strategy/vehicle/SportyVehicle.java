package org.example.designpattern.strategy.vehicle;

import org.example.designpattern.strategy.strategies.fuel.DieselFuelType;
import org.example.designpattern.strategy.strategies.drive.SportsDriveStrategy;

public class SportyVehicle extends Vehicle {
    public SportyVehicle() {
        super(new SportsDriveStrategy(), new DieselFuelType());
    }
}

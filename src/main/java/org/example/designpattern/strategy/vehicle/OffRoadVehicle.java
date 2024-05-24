package org.example.designpattern.strategy.vehicle;

import org.example.designpattern.strategy.strategies.fuel.PetrolFuelType;
import org.example.designpattern.strategy.strategies.drive.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy(), new PetrolFuelType());
    }
}

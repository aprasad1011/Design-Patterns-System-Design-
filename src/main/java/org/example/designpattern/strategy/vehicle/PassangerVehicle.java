package org.example.designpattern.strategy.vehicle;

import org.example.designpattern.strategy.strategies.drive.NormalDriveStrategy;
import org.example.designpattern.strategy.strategies.fuel.PetrolFuelType;

public class PassangerVehicle extends Vehicle {
    public PassangerVehicle(){
        super(new NormalDriveStrategy(), new PetrolFuelType());
    }

}

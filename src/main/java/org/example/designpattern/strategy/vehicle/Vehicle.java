package org.example.designpattern.strategy.vehicle;

import org.example.designpattern.strategy.strategies.fuel.IFuelType;
import org.example.designpattern.strategy.strategies.drive.IDriveStrategy;

public abstract class Vehicle {

    private IDriveStrategy driveStrategy;
    private IFuelType fuelType;

    Vehicle(IDriveStrategy driveStrategy, IFuelType fuelType){
        this.driveStrategy = driveStrategy;
        this.fuelType = fuelType;
    }

    public void drive(){
        driveStrategy.drive();
    }


    public void fuel(){
        fuelType.printFuelType();
    }

}

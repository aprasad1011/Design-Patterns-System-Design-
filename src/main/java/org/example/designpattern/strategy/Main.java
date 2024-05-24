package org.example.designpattern.strategy;

import org.example.designpattern.strategy.vehicle.OffRoadVehicle;
import org.example.designpattern.strategy.vehicle.PassangerVehicle;
import org.example.designpattern.strategy.vehicle.SportyVehicle;
import org.example.designpattern.strategy.vehicle.Vehicle;

public class Main {

    // Benefits
    // 1. Code Re-usability
    // 2. Single point for code change to effect all implementations.
    // 3. Easy to add new strategy.

    public static void main(String[] args) {
        System.out.println("-------------");
        Vehicle pVehicle = new PassangerVehicle();
        pVehicle.drive();
        pVehicle.fuel();
        System.out.println("-------------");

        Vehicle sportsVehicle = new SportyVehicle();
        sportsVehicle.drive();
        sportsVehicle.fuel();
        System.out.println("-------------");

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
        offRoadVehicle.fuel();
        System.out.println("-------------");
    }

}

package Lesson33.ExceptionHierarchyDesignPrincip.model;


import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.*;

public class ElectricBike implements Rideable {

    @Override
    public void ride(int tirePressure, boolean brakesWorking) throws BikeException {
        int batteryLevel = 20; // simulate battery

        if (batteryLevel < 20) {
            throw new BatteryLowException();
        }

        if (tirePressure < 20) {
            throw new FlatTireException();
        }

        if (!brakesWorking) {
            throw new BrakeFailureException();
        }

        System.out.println("Electric bike is running smoothly ⚡");
    }
}
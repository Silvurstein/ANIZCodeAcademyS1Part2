package Lesson33.ExceptionHierarchyDesignPrincip.model;

import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.BikeException;
import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.BrakeFailureException;
import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.FlatTireException;
import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.OverloadException;

public class ChristianiaBike implements Rideable {
    @Override
    public void ride(int tirePressure, boolean brakesWorking) throws BikeException {
        int Weight = 120;

        if (Weight > 100) {
            throw new OverloadException();
        }
        if (tirePressure < 20) {
            throw new FlatTireException();
        }

        if (!brakesWorking) {
            throw new BrakeFailureException();
        }
    }
}

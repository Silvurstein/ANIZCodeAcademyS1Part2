package Lesson33.ExceptionHierarchyDesignPrincip.app;

import Lesson33.ExceptionHierarchyDesignPrincip.model.*;
import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.*;

public class Main {
    public static void main(String[] args) {

        Rideable[] bikes = {
                new Bike(),
                new ElectricBike(),
                new ChristianiaBike(),
                new MountainBike()
        };

        for (Rideable bike : bikes) {
            try {
                bike.ride(15, true);
            } catch (BatteryLowException e) {
                System.out.println("Charge the battery!");
            }catch (OverloadException e) {
                System.out.println("Hit the gym you fat fuck");
            } catch (FlatTireException e) {
                System.out.println("Fix the tire!");
            } catch (BrakeFailureException e) {
                System.out.println("Fix the brakes!");
            } catch (BikeException e) {
                System.out.println("General bike issue!");
            }

            System.out.println("----");
        }
    }
}
package org.example.dependencies;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {

    static String trackingNumber = null;

    @Test
    public void createShipment() throws Exception {
        throw new Exception("");
//        System.out.println("Create shipment");
//        trackingNumber = "ABC12YH";
    }

    @Test(dependsOnMethods = {"createShipment"}, alwaysRun = true)
    public void trackShipment() throws Exception {
        if(trackingNumber != null) {
            System.out.println("Track shipment");
        } else {
            throw new Exception("Invalid tracking number");
        }
    }

    @Test(dependsOnMethods = {"createShipment", "trackShipment"})
    public void cancelShipment() throws Exception {
        if(trackingNumber != null) {
            System.out.println("Cancel shipment");
        } else {
            throw new Exception("Invalid tracking number");
        }
    }
}

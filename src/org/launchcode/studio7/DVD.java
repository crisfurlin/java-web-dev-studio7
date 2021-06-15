package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int storageCapacity, String diskType, int aCapacityUsed) {
        super(name, storageCapacity, diskType, aCapacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 RPM");
    }

    @Override
    public void readData() {
        System.out.println("Trooo muuuuv");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

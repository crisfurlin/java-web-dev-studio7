package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, int storageCapacity, String diskType, int aCapacityUsed) {
        super(name, storageCapacity, diskType, aCapacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate between 200-500 RPM");
    }

    @Override
    public void readData() {
        System.out.println("Imma leave the door open");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

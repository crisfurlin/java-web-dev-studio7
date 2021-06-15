package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BaseDisc (String name, int storageCapacity, String diskType, int aCapacityUsed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.diskType = diskType;
        capacityUsed = checkCapacity(aCapacityUsed);
        remainingCapacity = spaceLeft();
    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String diskInfo() {
        String output = String.format("\nDisk name: %s\nMax capacity: %d" +
                "\nSpace used: %d" +
                "\n Available space: %d\n", name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough disk space";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space = " + remainingCapacity;
    }
}

package com.brainacad.module2.lesson1;

public class ComputerUtils {

    public static Computer createIndexBasedComputer(int i) {
        Computer computer = new Computer();
        computer.setSerialNumber(1000 + i);
        computer.setManufacturer("Manufacturer " + i);
        computer.setPrice(1000 + 100 * i);
        computer.setFrequencyCPU(5000);
        computer.setQuantityCPU(4);
        return computer;
    }

}

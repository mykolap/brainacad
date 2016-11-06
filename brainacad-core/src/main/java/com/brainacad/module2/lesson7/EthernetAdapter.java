package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 06.11.2016.
 */
public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}

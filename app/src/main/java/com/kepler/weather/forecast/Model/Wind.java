package com.kepler.weather.forecast.Model;

/**
 * Created by Aslam Rathore on 14-02-2020.
 */
public class Wind {

    private double speed;
    private int deg;

    public Wind() {
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}

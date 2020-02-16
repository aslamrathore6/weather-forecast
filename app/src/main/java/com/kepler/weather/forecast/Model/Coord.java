package com.kepler.weather.forecast.Model;

import androidx.annotation.NonNull;

/**
 * Created by Aslam Rathore on 14-02-2020.
 */
public class Coord {

    private double lon;
    private double lat;

    public Coord() {
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @NonNull
    @Override
    public String toString() {
        return new StringBuilder(' ').append('[').append(this.lat).append(',').append(this.lon).append(']').toString();
    }
}

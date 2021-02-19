package com.company;

public class Planet extends OrbitalObject{

    public Planet(int distance) {
        this.distance = distance;
    }
    public int distanceBetweenTwo(Planet planet1){
        return Math.abs(planet1.distance - this.distance);
    }

}

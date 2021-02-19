package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Planet earth = new Planet(150000000);
        Planet mars = new Planet(228000000);
        Moon moon = new Moon(384000, earth);
        Planet jupiter = new Planet(778000000);
        Moon europa = new Moon(670000, jupiter);
        Moon eanymedes = new Moon(1070000, jupiter);
        Moon moon1 = new Moon();
        ArrayList<Moon> moonsList = new ArrayList<Moon>();
        moonsList.add(moon);
        moonsList.add(europa);
        moonsList.add(eanymedes);
        System.out.println("Your planet has " + moon1.howManyMoons(jupiter, moonsList) + " moons");

    }
}

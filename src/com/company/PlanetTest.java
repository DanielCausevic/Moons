package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlanetTest {

    @Test
    public void distanceBetweenTwo() {
        Planet earth = new Planet(150);
        Planet mars = new Planet(228);
        int test = earth.distanceBetweenTwo(mars);
        assertEquals(78, test);
    }

    @org.junit.jupiter.api.Test
    void testDistanceBetweenTwo() {
    }
}
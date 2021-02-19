package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Moon extends OrbitalObject{
    Planet belongsTo;

    public Moon(int distance, Planet belongsTo) {
        this.distance = distance;
        this.belongsTo = belongsTo;
    }

    public Moon(){

    }

    public int howManyMoons(Planet planet, ArrayList<Moon> moonsList){
        int moons = 0;
        for(int i = 0; i < moonsList.size(); i++){
            if(moonsList.get(i).belongsTo == planet){
                moons++;
            }
        }
        return moons;
    }
}

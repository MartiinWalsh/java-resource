package com.mcodes;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }
    public void showTable(){
        // The collections framework will use the overridden compareTo method in the Teams class
        Collections.sort(league);
        for(T team : league){
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}

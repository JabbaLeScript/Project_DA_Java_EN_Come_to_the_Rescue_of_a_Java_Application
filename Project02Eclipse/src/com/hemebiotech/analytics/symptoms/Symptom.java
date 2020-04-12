package com.hemebiotech.analytics.symptoms;

import java.util.*;

/**
 * a Symptom object that represent a data symptom
 */

public  class Symptom {
    /**
     * Tree map to store data symptoms (key : name,value : number of occurence)
     */
    private Map<String, Integer> mapSymptom = new TreeMap<>();

    private String type;
    private int occurence;


    /**
     *
     * @return a Map object
     */
    public Map<String, Integer> getMapSymptom() {
        return mapSymptom;
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "mapSymptom=" + mapSymptom +
                '}';
    }
}

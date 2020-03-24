package com.hemebiotech.analytics.symptoms;

import java.util.*;

/**
 * a Symptom object
 */

public  class Symptom {
    /**
     * Tree map to store data symptoms
     */
    Map<String, Integer> mapSymptom = new TreeMap<>();

    /**
     *
     * @return a Map object
     */
    public Map<String, Integer> getMapSymptom() {
        return mapSymptom;
    }

    public void setMapSymptom(Map<String, Integer> mapSymptom) {
        this.mapSymptom = mapSymptom;
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "mapSymptom=" + mapSymptom +
                '}';
    }
}

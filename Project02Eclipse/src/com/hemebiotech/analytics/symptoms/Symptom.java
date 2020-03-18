package com.hemebiotech.analytics.symptoms;

import java.util.*;

public  class Symptom {

    Map<String, Integer> mapSymptom = new HashMap<>();


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

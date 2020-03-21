package com.hemebiotech.analytics.mapping;

import com.hemebiotech.analytics.symptoms.Symptom;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SourceTextTable extends SourceTable {

    @Override
    public Map<String, Integer> getSymptom(List<String> stringList) {

        Symptom oSymptom = new Symptom();

        Map<String, Integer> mapSymptom = oSymptom.getMapSymptom();

        for (String name:stringList
        ) {
            int freq = Collections.frequency(stringList, name);
            mapSymptom.put(name, freq);
        }
        Map<String, Integer> result = new TreeMap<>(mapSymptom);
        return result;
    }
}

package com.hemebiotech.analytics.mapping;

import com.hemebiotech.analytics.symptoms.Symptom;

import java.util.*;
import java.util.stream.Collectors;

/**
 * variant of SourceTable for text file mapping
 * @see SourceTable
 * @implSpec SourceTable
 */

public class SourceTextTable extends SourceTable {

    @Override
    public Map<String, Integer> getSymptomByName(List<String> stringList) {

        Symptom oSymptom = new Symptom();
        Map<String, Integer> mapSymptom = oSymptom.getMapSymptom();

        for (String name:stringList
        ) {
            int freq = Collections.frequency(stringList, name);
            mapSymptom.put(name, freq);
        }
        return mapSymptom;
    }

    @Override
    public Map<String, Integer> getSymptomByValue(Map<String, Integer> mapByKeyName) {
        return mapByKeyName.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    }
}

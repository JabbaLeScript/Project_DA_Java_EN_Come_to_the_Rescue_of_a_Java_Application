package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.Symptom;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class WriteSymptomDataToFile implements ISymptomWriter {

    ISymptomReader symptomReader = new ReadSymptomDataFromFile();

    @Override
    public void writeToFile() {
        List<String> lLines = symptomReader.getLinesFromFile();

        Map<String, Integer> mapSymptoms = symptomReader.getMapSymptoms(lLines);
        
        try {
            FileWriter writer = new FileWriter("result.out");
            for (Map.Entry<String, Integer> entry:mapSymptoms.entrySet()
                 ) {
                writer.write(entry.getKey() + " = " + entry.getValue() + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

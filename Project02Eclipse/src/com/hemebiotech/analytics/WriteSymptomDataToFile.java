package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.Symptom;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteSymptomDataToFile implements ISymptomWriter {

    ISymptomReader symptomReader = new ReadSymptomDataFromFile();

    @Override
    public void writeToFile() {

        List<String> lLines = symptomReader.getLinesFromFile();
        List<Symptom> sortedList = symptomReader.getSymptoms(lLines);

//        List<Symptom> lSymptoms = symptomReader.getSymptoms(lLines);

        try {
            FileWriter writer = new FileWriter("result.out");
            for (Symptom symptom: sortedList
            ) {
                System.out.println(symptom);
                writer.write(symptom.getName() + " = " + symptom.getOccurs() + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

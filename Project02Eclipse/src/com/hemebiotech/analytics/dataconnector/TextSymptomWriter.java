package com.hemebiotech.analytics.dataconnector;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * implementation of {@link ISymptomWriter}
 * @see ISymptomWriter
 * @implSpec ISymptomWriter
 */
public class TextSymptomWriter implements ISymptomWriter {

    @Override
    public void fileWriter(Map<String, Integer> mapSymptom) {
        try {
            FileWriter writer = new FileWriter("result.out");
            for (Map.Entry<String, Integer> entry:mapSymptom.entrySet()
                 ) {
                writer.write(entry.getKey() + " = " + entry.getValue() + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

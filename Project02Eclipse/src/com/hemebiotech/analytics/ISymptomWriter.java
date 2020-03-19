package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomWriter {
    void writeToFile(Map<String, Integer> mapSymptom);
}

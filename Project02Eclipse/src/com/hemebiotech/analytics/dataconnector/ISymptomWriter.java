package com.hemebiotech.analytics.dataconnector;

import java.util.Map;

public interface ISymptomWriter {
    void fileWriter(Map<String, Integer> mapSymptom);
}

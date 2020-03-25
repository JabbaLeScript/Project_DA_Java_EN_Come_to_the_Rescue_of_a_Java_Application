package com.hemebiotech.analytics.dataconnector;

import java.util.Map;

/**
 * Anything that will write symptom data to a target
 * the symptom data written are order alphabetically and without any duplicates
 */

public interface ISymptomWriter {
    /**
     *
     * @param mapSymptom
     */
    void fileWriter(Map<String, Integer> mapSymptom);
}

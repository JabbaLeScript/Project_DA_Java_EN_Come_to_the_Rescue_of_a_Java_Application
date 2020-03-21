package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.Symptom;

import javax.swing.plaf.synth.SynthLabelUI;
import java.util.*;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	List<String> fileReader(String filePath);
	Map<String, Integer> getSymptom(List<String> stringList);
}

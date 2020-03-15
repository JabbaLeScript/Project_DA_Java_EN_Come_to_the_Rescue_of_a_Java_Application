package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.Symptom;

import java.util.ArrayList;
import java.util.List;

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
	List<String> getLinesFromFile();
	List<Symptom> getListSymptoms(List<String> stringList);
	List<Symptom> getSymptoms(List<String > nameList, List<Symptom> symptomList);
}

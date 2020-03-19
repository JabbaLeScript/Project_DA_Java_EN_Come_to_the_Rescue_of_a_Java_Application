package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private static String filepath = "Project02Eclipse/symptoms.txt";
	private static ISymptomReader symptomReader;
	private static ISymptomWriter symptomWriter;

	public static void main(String args[]) throws Exception {
		// create object
		symptomReader = new ReadSymptomDataFromFile();
		symptomWriter = new WriteSymptomDataToFile();

		//get symptom name and their occurences, sorted alphabatically
		List<String> listSymptomName = symptomReader.getLinesFromFile(filepath);
		Map<String, Integer> mapSymptom = symptomReader.getMapSymptoms(listSymptomName);

		//write the sorted data to a new file
		symptomWriter.writeToFile(mapSymptom);
	}
}

package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private static String filepath = "Project02Eclipse/symptoms.txt";
	private static ISymptomReader symptomReader;
	private static ISymptomWriter symptomWriter;

	public static void main(String args[]) throws Exception {
		// create object
		symptomReader = new TextSymptomReader();
		symptomWriter = new TextSymptomWriter();

		//get symptom name and their occurences, sorted alphabetically
		List<String> listSymptomName = symptomReader.fileReader(filepath);
		Map<String, Integer> mapSymptom = symptomReader.getSymptom(listSymptomName);

		//write the sorted data to a new file
		symptomWriter.fileWriter(mapSymptom);
	}
}

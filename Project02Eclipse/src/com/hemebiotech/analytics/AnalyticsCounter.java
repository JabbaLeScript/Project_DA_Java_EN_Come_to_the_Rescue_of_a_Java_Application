package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.Symptom;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		new WriteSymptomDataToFile().writeToFile();

		/*ISymptomReader symptomReader = new ReadSymptomDataFromFile();
		List<Symptom> lSymptoms = symptomReader.getSymptoms();

		FileWriter writer = new FileWriter("result.out");

		for (Symptom symptom: lSymptoms
			 ) {
			System.out.println(symptom);
			writer.write(symptom.getName() + " = " + symptom.getOccurs() + System.lineSeparator());
		}
		writer.close();*/
	}
}

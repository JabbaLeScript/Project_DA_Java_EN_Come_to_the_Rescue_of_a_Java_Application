package com.hemebiotech.analytics;

import com.hemebiotech.analytics.datasource.TextDataSource;
import com.hemebiotech.analytics.dataconnector.TextSymptomReader;
import com.hemebiotech.analytics.dataconnector.TextSymptomWriter;
import com.hemebiotech.analytics.mapping.SourceTextTable;

import java.io.File;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private static String filepath = "Project02Eclipse/symptoms.txt";

	public static void main(String args[]) throws Exception {

	File file = new File(filepath);

	TextDataSource textDataSource = new TextDataSource(file);

	List<String> textSymptomReader = new TextSymptomReader().fileReader(textDataSource);

	Map<String, Integer> textSourceTable = new SourceTextTable().getSymptom(textSymptomReader);

	new TextSymptomWriter().fileWriter(textSourceTable);






		/*// create object
		symptomReader = new TextSymptomReader();
		symptomWriter = new TextSymptomWriter();

		//get symptom name and their occurences, sorted alphabetically
		List<String> listSymptomName = symptomReader.fileReader(filepath);
		Map<String, Integer> mapSymptom = symptomReader.getSymptom(listSymptomName);

		//write the sorted data to a new file
		symptomWriter.fileWriter(mapSymptom);*/
	}
}

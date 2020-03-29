package com.hemebiotech.analytics;

import com.hemebiotech.analytics.datasource.FileDataSource;
import com.hemebiotech.analytics.datasource.TextDataSource;
import com.hemebiotech.analytics.dataconnector.TextSymptomReader;
import com.hemebiotech.analytics.dataconnector.TextSymptomWriter;
import com.hemebiotech.analytics.mapping.SourceTextTable;

import java.io.File;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
	// the path of symptom.txt
	String filepath = args[0];

	File file = new File(filepath);

	// instanciation of a FileDataSourc object : it could be a text or other format
	FileDataSource textDataSource = new TextDataSource(file);

	//Read the data and return a list of String
	List<String> textSymptomReader = new TextSymptomReader().fileReader(textDataSource);

	//map the name of the symptom with its number of occurences
	Map<String, Integer> textSourceTable = new SourceTextTable().getSymptom(textSymptomReader);

	//write the result in another file
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

package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	//relative file path
	private static String filepath = "Project02Eclipse/symptoms.txt";

	@Override
	public List<String> getLinesFromFile() {
		ArrayList<String> result = new ArrayList<String>();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	@Override
	public Map<String, Integer> getMapSymptoms(List<String> stringList) {

		// tree map to get the data sorted alphabetically
		Map<String, Integer> result = new TreeMap<>();
		// creation of a Symptom object
		Symptom oSymptom = new Symptom();
		//get acces to the variable instance, which is a HashMap
		Map<String, Integer> mapSymptom = oSymptom.getMapSymptom();

		for (String name:stringList
			 ) {
			int freq = Collections.frequency(stringList, name);
			mapSymptom.put(name, freq);
		}
		result.putAll(mapSymptom);
		return result;
	}

}

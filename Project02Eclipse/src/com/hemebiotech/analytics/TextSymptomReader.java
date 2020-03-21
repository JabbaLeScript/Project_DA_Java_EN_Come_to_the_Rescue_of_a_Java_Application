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
public class TextSymptomReader implements ISymptomReader {

	@Override
	public List<String> fileReader(String filepath) {
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
	public Map<String, Integer> getSymptom(List<String> stringList) {

		Map<String, Integer> result = new TreeMap<>();
		Symptom oSymptom = new Symptom();

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

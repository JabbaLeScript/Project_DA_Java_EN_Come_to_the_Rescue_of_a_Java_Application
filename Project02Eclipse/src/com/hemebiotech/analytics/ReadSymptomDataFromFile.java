package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private static String filepath = "C:\\Users\\avieira\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";

	Symptoms headache = new Headache("headache");

	@Override
	public List<String> getLinesFromFile() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
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
	public List<Symptoms> getSymptoms(List<String> sList) {
		List<Symptoms> symptoms = new ArrayList<Symptoms>();
		for (String nameSymptom: sList
			 ) {
			if (nameSymptom.equals(headache.getName())){
				int nbrOccurs= headache.getOccurs();
				nbrOccurs++;
				headache.setOccurs(nbrOccurs);
			}
		}
		symptoms.add(headache);
		return symptoms;
	}

}

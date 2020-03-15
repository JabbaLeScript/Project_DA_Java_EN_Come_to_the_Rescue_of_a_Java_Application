package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private static String filepath = "C:\\Users\\avieira\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";

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
	public ArrayList<Symptom> getListSymptoms(List<String> aList) {
		ArrayList<Symptom> listSymptoms = new ArrayList<Symptom>();
		for (String name : aList
		) {
			listSymptoms.add(new Symptom(name));
		}
		return listSymptoms;
	}

	@Override
	public List<Symptom> getSymptoms(List<String> sList, List<Symptom> oList) {
		/*
		List<Symptom> symptoms = new ArrayList<Symptom>();
		symptoms.add(new Symptom("headache"));
		symptoms.add(new Symptom("cough"));
		symptoms.add(new Symptom("fever"));*/

		List<Symptom> sortedList = new ArrayList<>();



		sortedList.sort(Comparator.comparing(Symptom::getName));
		return sortedList;
	}


}
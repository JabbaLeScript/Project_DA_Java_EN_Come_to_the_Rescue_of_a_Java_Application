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

	Symptom headache = new Headache("headache");
	Symptom fever = new Fever("fever");
	Symptom cough= new Cough("cough");


	@Override
	public List<Symptom> getSymptoms() {

		ArrayList<Symptom> result = new ArrayList<Symptom>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					if (line.equals(headache.getName())){
						int nbrOccurs = headache.getOccurs();
						nbrOccurs++;
						headache.setOccurs(nbrOccurs);
					}
					else if (line.equals(fever.getName())){
						int nbrOccurs = fever.getOccurs();
						nbrOccurs++;
						fever.setOccurs(nbrOccurs);
					}
					else if (line.equals(cough.getName())){
						int nbrOccurs = cough.getOccurs();
						nbrOccurs++;
						cough.setOccurs(nbrOccurs);
					}

					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//Adding the symptoms
		result.add(headache);
		result.add(fever);
		result.add(cough);
		//sort the list alphabetically
		result.sort(Comparator.comparing(Symptom::getName));
		return result;
	}

}

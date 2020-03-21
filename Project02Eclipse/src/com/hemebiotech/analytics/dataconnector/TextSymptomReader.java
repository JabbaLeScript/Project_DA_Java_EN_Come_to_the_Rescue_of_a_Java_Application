package com.hemebiotech.analytics.dataconnector;

import com.hemebiotech.analytics.datasource.FileDataSource;
import com.hemebiotech.analytics.symptoms.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Simple brute force implementation
 *
 */
public class TextSymptomReader implements ISymptomReader {


	@Override
	public List<String> fileReader(FileDataSource fileDataSource) {
		File file = fileDataSource.getFile();
		ArrayList<String> result = new ArrayList<String>();
		if (file != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
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

}

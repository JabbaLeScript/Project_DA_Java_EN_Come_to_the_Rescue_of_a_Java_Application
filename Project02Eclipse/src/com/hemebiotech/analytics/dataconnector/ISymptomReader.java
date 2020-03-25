package com.hemebiotech.analytics.dataconnector;

import com.hemebiotech.analytics.datasource.FileDataSource;

import java.util.*;

/**
 * Anything that will read symptom data from a source
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source
	 * @param fileDataSource
	 */
	List<String> fileReader(FileDataSource fileDataSource);
}

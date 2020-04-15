package com.hemebiotech.analytics;

import com.hemebiotech.analytics.dataconnector.ISymptomReader;
import com.hemebiotech.analytics.dataconnector.ISymptomWriter;
import com.hemebiotech.analytics.datasource.FileDataSource;
import com.hemebiotech.analytics.datasource.TextDataSource;
import com.hemebiotech.analytics.dataconnector.TextSymptomReader;
import com.hemebiotech.analytics.dataconnector.TextSymptomWriter;
import com.hemebiotech.analytics.mapping.SourceTable;
import com.hemebiotech.analytics.mapping.SourceTextTable;

import java.io.File;


public class AnalyticsCounter {
	
	public FileDataSource getTextDataSource(File file) { return new TextDataSource(file); }
	
	public ISymptomReader getReader(FileDataSource fileDataSource){
		return new TextSymptomReader();
	}
	
	public SourceTable getMapper(ISymptomReader aReader){
		return new SourceTextTable();
	}
	
	public ISymptomWriter getWriter(){
		return new TextSymptomWriter();
	}

}

package com.hemebiotech.analytics;

import com.hemebiotech.analytics.dataconnector.ISymptomReader;
import com.hemebiotech.analytics.dataconnector.ISymptomWriter;
import com.hemebiotech.analytics.datasource.FileDataSource;
import com.hemebiotech.analytics.mapping.SourceTable;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception   {
        try {
        String filepath = args[0];

        File file = new File(filepath);

        AnalyticsCounter analyticsCounter = new AnalyticsCounter();

        FileDataSource textDataSource = analyticsCounter.getTextDataSource(file);

        ISymptomReader reader = analyticsCounter.getReader(textDataSource);
        List<String> listSymptoms = reader.fileReader(textDataSource);

        SourceTable mapper = analyticsCounter.getMapper(reader);
        Map<String, Integer> sortedListSymptom = mapper.getSymptom(listSymptoms);

        ISymptomWriter writer = analyticsCounter.getWriter();
        writer.fileWriter(sortedListSymptom);

        System.out.println("file generated !");

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("you must specify an input file");
        }

    }

}

package com.hemebiotech.analytics.mapping;

import java.util.List;
import java.util.Map;

/**
 * class to represent the mapping between values
 */
public abstract class SourceTable {
    /**
     *
     * @param stringList
     * @return a Map object in which each data are ordered alphabetically and without duplicates
     */
    public  abstract  Map<String, Integer> getSymptom(List<String> stringList);

}

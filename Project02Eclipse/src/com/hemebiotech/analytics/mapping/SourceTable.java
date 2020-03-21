package com.hemebiotech.analytics.mapping;

import java.util.List;
import java.util.Map;

public abstract class SourceTable {
    public  abstract  Map<String, Integer> getSymptom(List<String> stringList);

}

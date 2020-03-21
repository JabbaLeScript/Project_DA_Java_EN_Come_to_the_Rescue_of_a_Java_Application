package com.hemebiotech.analytics.datasource;

import java.io.File;

/**
 * Represents a file data source like CSV, Excel, JSON, XML, etc.
* */
public abstract class FileDataSource {
    public abstract File getFile();
    public abstract String getString();

}

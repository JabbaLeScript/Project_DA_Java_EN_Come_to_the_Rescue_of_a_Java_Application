package com.hemebiotech.analytics.datasource;

import java.io.File;

/**
 * Represents a file data source like CSV, Excel, JSON, XML, etc.
* */
public abstract class FileDataSource {
    /**
     *
     * @return a File object, which is the relative path of file
     */
    public abstract File getFile();

    /**
     *
     * @return a String object, which is the absolute path of the file
     */
    public abstract String getPath();
}

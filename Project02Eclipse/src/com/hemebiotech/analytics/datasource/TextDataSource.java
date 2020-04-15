package com.hemebiotech.analytics.datasource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Variant of FileDataSource for a text file.
 * @see FileDataSource
 */

public class TextDataSource extends FileDataSource {

    private File file;

    public TextDataSource(File file) {

        this.file = file;
    }

    @Override
    public File getFile() {
        return this.file;
    }

    @Override
    public String getPath() {
        return this.file.getAbsolutePath();
    }
}

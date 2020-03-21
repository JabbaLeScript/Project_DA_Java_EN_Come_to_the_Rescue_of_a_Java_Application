package com.hemebiotech.analytics.datasource;

import java.io.File;

public class TextDataSource extends FileDataSource {
    File file;

    public TextDataSource(File file) {
        this.file = file;
    }

    @Override
    public File getFile() {
        return this.file;
    }

    @Override
    public String getString() {
        return file.getAbsolutePath();
    }
}

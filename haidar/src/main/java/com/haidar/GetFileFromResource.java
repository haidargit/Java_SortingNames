package com.haidar;

import java.io.InputStream;

public class GetFileFromResource {
    public InputStream getFileFromResourceAsStream(String fileName) {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("Your file not found " + fileName);
        } else {
            return inputStream;
        }

    }
    
}

package com.ssgh.facadePattern;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public String Read(String fileNameSrc) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileReader reader = new FileReader(fileNameSrc);
        int data;
        while ((data = reader.read()) != -1) {
            sb.append(data);
        }
        reader.close();
        return sb.toString();
    }
}

package com.ssgh.facadePattern;

import java.io.FileWriter;

public class FileWriter1 {
    public void Write(String encryptStr, String fileNameDes) throws Exception {
        System.out.println("保密文件，写入文件" + fileNameDes);
        FileWriter writer = null;
        writer = new FileWriter(fileNameDes);
        writer.write(encryptStr);
        writer.close();
    }
}

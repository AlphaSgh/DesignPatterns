package com.ssgh.facadePattern;

import java.io.IOException;

public class EncryptFacade  implements AbstractEncryptFacade{
    private FileReader1 fileReader1;
    private FileWriter1 fileWriter1;
    private CipherMachine cipherMachine;

    public EncryptFacade() {
        fileReader1 = new FileReader1();
        fileWriter1 = new FileWriter1();
        cipherMachine = new CipherMachine();
    }

    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) throws Exception {
        String plainStr = fileReader1.Read(fileNameSrc);
        String encryptStr = cipherMachine.Encrypt(plainStr);
        fileWriter1.Write(encryptStr, fileNameDes);
    }
}

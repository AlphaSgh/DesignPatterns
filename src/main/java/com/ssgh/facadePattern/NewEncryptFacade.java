package com.ssgh.facadePattern;

public class NewEncryptFacade implements AbstractEncryptFacade{
    private FileReader1 fileReader1;
    private FileWriter1 fileWriter1;
    private NewCipherMachine newCipherMachine;

    public NewEncryptFacade() {
        fileReader1 = new FileReader1();
        fileWriter1 = new FileWriter1();
        newCipherMachine = new NewCipherMachine();
    }

    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) throws Exception {
        String plainStr = fileReader1.Read(fileNameSrc);
        String encryptStr = newCipherMachine.Encrypt(plainStr);
        fileWriter1.Write(encryptStr, fileNameDes);
    }
}

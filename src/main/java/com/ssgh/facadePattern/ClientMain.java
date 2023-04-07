package com.ssgh.facadePattern;

public class ClientMain{
    public static void main(String[] args) throws Exception {
//        EncryptFacade facade = new EncryptFacade();
        AbstractEncryptFacade facade = new NewEncryptFacade();
        facade.fileEncrypt("src/main/java/com/ssgh/facadePattern/src.txt", "src/main/java/com/ssgh/facadePattern/dest.txt");

    }
}

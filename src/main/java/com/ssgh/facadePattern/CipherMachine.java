package com.ssgh.facadePattern;

public class CipherMachine {
    public String Encrypt(String plainText) {
        System.out.println("数据加密");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char ch : chars) {
            String c = String.valueOf((char) ((int) ch % 7));
            es += c;
        }
        return es;
    }
}

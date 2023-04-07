package com.ssgh.facadePattern;

public class NewCipherMachine {
    public String Encrypt(String plainText) {
        System.out.println("数据加密 new");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char ch : chars) {
            String c = String.valueOf((char) ((int) ch % 8));
            es += c;
        }
        return es;
    }
}

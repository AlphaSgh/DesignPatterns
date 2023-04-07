package com.ssgh.facadePattern;

import java.io.IOException;

//抽象的外观
public interface AbstractEncryptFacade {
    public void fileEncrypt(String fileNameSrc, String fileNameDes) throws Exception;
}

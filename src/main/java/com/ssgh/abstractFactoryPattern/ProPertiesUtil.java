package com.ssgh.abstractFactoryPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ProPertiesUtil {
    public static Object getBean() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/config.properties"));
        String className = properties.getProperty("className");

        Class c = Class.forName(className);
        Object o = c.newInstance();
        return o;
    }
}

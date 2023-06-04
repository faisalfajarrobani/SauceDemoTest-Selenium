package com.apptest.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    public static Properties properties = new Properties();
    public static FileInputStream fis;

//    GET VALUE FROM DIRECTORY CONFIG PROPERTIES
    public static Properties loadApplicationProperties(){
        try {
            fis = new FileInputStream("src/test/resources/Config/application.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static Properties loadUserProperties(){
        try {
            fis = new FileInputStream("src/test/resources/Config/user.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static Properties loadFrameworkProperties(){
        try {
            fis = new FileInputStream("src/test/resources/Config/framework.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}

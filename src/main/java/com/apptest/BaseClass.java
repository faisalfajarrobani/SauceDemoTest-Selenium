package com.apptest;

import com.apptest.Utils.PropertiesUtil;
import java.util.Properties;
import static com.apptest.Utils.BrowserUtil.driver;
import static com.apptest.Utils.BrowserUtil.getWebDriver;

public class BaseClass {
    public static Properties properties = PropertiesUtil.loadFrameworkProperties();
    public static String webDriver = properties.get("browser.driver").toString();

//    Run web driver function
    public static void DriverRun() throws InterruptedException {
        getWebDriver(webDriver);
    }

//    Stop web driver function
    public static void DriverStop(){
        driver.quit();
    }
}

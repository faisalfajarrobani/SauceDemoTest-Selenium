package com.apptest.PageObject;

import com.apptest.Utils.BrowserUtil;
import com.apptest.Utils.PropertiesUtil;

import java.util.Properties;

public class LoginPage {

//    locators "xpath"
    public static String pageLogin = "//div[@class='login_container']";
    private static String fieldUsername = "//input[@id='user-name']";
    private static String fieldPassword = "//input[@id='password']";
    private static String buttonLogin = "//input[@id='login-button']";

//    properties instance
    public static Properties properties = PropertiesUtil.loadUserProperties();
    public static String username = properties.getProperty("valid.username");
    public static String password = properties.getProperty("valid.password");

//    actions function
    public static void validateLoginPage(){
        BrowserUtil.assertElementValidate(pageLogin);
    }

    public static void enterUsernameAndPassword(){
        BrowserUtil.enterText(fieldUsername,username);
        BrowserUtil.enterText(fieldPassword,password);
    }

    public static void clickLoginButton(){
        BrowserUtil.clickElement(buttonLogin);
    }

    public static void validateInventoryPage(){
        String isPage = InventoryPage.pageInventory;
        BrowserUtil.assertElementValidate(isPage);
    }
}

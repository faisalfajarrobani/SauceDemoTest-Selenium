package com.apptest.PageObject;

import com.apptest.Utils.BrowserUtil;

public class CheckoutPage {

//    locators "xpath"
    private static String buttonCartIcon = "//div[@id='shopping_cart_container']";
    private static String sectionCart = "//div[@id='cart_contents_container']";
    private static String buttonCheckout = "//button[@id='checkout']";
    private static String sectionInformationForm = "//div[@id='checkout_info_container']";
    private static String fieldFirstName = "//input[@id='first-name']";
    private static String fieldLastName = "//input[@id='last-name']";
    private static String fieldPostalCode = "//input[@id='postal-code']";
    private static String buttonContinue = "//input[@id='continue']";
    private static String sectionSummary = "//div[@id='checkout_summary_container']";
    private static String buttonFinish = "//button[@id='finish']";
    private static String messageSuccess = "//h2[contains(text(),'Thank you for your order!')]";
    private static String pageSuccessCheckout = "//div[@id='checkout_complete_container']";
    private static String validateProductItem = "//div[@class='inventory_item_name'][text() = 'Sauce Labs Onesie']";

//    actions function
    public static void clickCartIcon(){
        BrowserUtil.clickElement(buttonCartIcon);
    }

    public static void clickCheckout(){
        BrowserUtil.assertElementValidate(sectionCart);
        BrowserUtil.clickElement(buttonCheckout);
    }

    public static void enterValueToFrome(){
        BrowserUtil.assertElementValidate(sectionInformationForm);
        BrowserUtil.enterText(fieldFirstName,"Faisal");
        BrowserUtil.enterText(fieldLastName, "Fajar");
        BrowserUtil.enterText(fieldPostalCode, "14045");
    }

    public static void clickContinue(){
        BrowserUtil.clickElement(buttonContinue);
    }

    public static void validateProduct(){
        BrowserUtil.assertElementValidate(sectionSummary);
        BrowserUtil.validateText(validateProductItem,"Sauce Labs Onesie");
    }

    public static void clickFinish(){
        BrowserUtil.clickElement(buttonFinish);
    }

    public static void validateSuccessCheckout(){
        BrowserUtil.assertElementValidate(pageSuccessCheckout);
        BrowserUtil.assertElementValidate(messageSuccess);
    }
}

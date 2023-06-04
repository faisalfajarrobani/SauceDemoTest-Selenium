package com.apptest.PageObject;

import com.apptest.Utils.BrowserUtil;

public class InventoryPage {

//    locators "xpath"
    public static String pageInventory = "//div[@id='inventory_container']";
    private static String dropDownContainer = "//select[@class='product_sort_container']";
    private static String searchBasedFromLowPrice = "//option[contains(text(),'Price (low to high)')]";
    public static String linkProduct = "//a[@id='item_2_title_link']";
    private static String buttonAddToCart = "//button[text() = 'Add to cart']";
    private static String buttonRemoveFromCart = "//button[text() = 'Remove']";
    public static String pageProductItem = "//div[@id='inventory_item_container']";
    private static String buttonBurger = "//button[@id='react-burger-menu-btn']";
    private static String buttonLogout = "//a[@id='logout_sidebar_link']";

//     actions function
    public static void isInventoryPage() throws InterruptedException {
        BrowserUtil.assertElementValidate(pageInventory);
    }

    public static void seachBasedFromLowPrice() throws InterruptedException {
        BrowserUtil.clickElement(dropDownContainer);
        BrowserUtil.clickElement(searchBasedFromLowPrice);
    }

    public static void clickProduct() throws InterruptedException {
        BrowserUtil.clickElement(linkProduct);
        BrowserUtil.assertElementValidate(pageProductItem);
    }

    public static void clickAddToCart() throws InterruptedException {
        BrowserUtil.clickElement(buttonAddToCart);
    }

    public static void isAddedToCart() throws InterruptedException {
        BrowserUtil.assertElementValidate(buttonRemoveFromCart);
    }

    public static void clickBurgerButton(){
        BrowserUtil.clickElement(buttonBurger);
    }

    public static void clickLogoutButton(){
        BrowserUtil.clickElement(buttonLogout);
    }
}

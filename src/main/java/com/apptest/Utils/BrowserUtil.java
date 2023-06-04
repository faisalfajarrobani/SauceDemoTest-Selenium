package com.apptest.Utils;

import com.apptest.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class BrowserUtil extends BaseClass {
    public static WebDriver driver;
    public static Properties properties = PropertiesUtil.loadApplicationProperties();
    public static String url = properties.getProperty("application.url").toString();

//    Click Element Function (element)
    public static void clickElement(String element){
        findAndWaitElement(element).click();
    }

//    Enter Text Function (element, text)
    public static void enterText(String element, String text){
        findAndWaitElement(element).clear();
        findAndWaitElement(element).sendKeys(text);
    }

//    Validate element using assert true function (element)
    public static void assertElementValidate(String element){
        Assert.assertTrue(findAndWaitElement(element).isDisplayed());
    }

//    Validate actual text equals to expected text (element.getText(), expectedtext)
    public static void validateText(String element,String expectedText){
        String actualText = findAndWaitElement(element).getText();
        Assert.assertTrue("Expected Text: " + expectedText + " is not matching with actual text: " + actualText,expectedText.equals(actualText) );
    }

//    Validate actual value (int) from atribute equals to expected value (element.getAttribute(typeValue), expectedValue, typeValue)
    public static void validateValue(String element,String expectedValue, String typeValue){
        String actualValue = findAndWaitElement(element).getAttribute(typeValue);
        Assert.assertTrue("Expected Value: " + expectedValue + " is not matching with actual text: " + actualValue,expectedValue.equals(actualValue) );
    }

//    Drop down selected function (Hover element, click/select)
    public static void hoverAndSelectElement(String element1, String element2){
        WebElement e1 = driver.findElement(By.xpath(element1));
        WebElement e2 = driver.findElement(By.xpath(element2));

        Actions action = new Actions(driver);
        action.click(e1).click(e2).build().perform();
    }

//    Find element by xpath function (xpath value). equals to driver.findElement(By.xpath(""));
    public static WebElement findAndWaitElement(String xpath) {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
        } catch (Exception e) {
            System.out.println("Element Not Found!!!!");
        }
        return element;
    }

//      Web driver select function (name of browser)
    public static WebDriver getWebDriver(String browser){
        if (browser!=null){
            if (browser.equalsIgnoreCase("chrome")){
                driver = setChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")){
                driver = setFirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")){
                driver = setEdgeDriver();
            }
        }
        return driver;
    }

//      Chrome driver function
    private static WebDriver setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

//      firefox driver function
    private static WebDriver setFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

//    Edge driver function
    private static WebDriver setEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}

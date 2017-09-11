package com.epam.latysheva.page;

import com.epam.latysheva.driver.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page1 {

    private static int WAIT_CONST = 10;
    protected WebDriver driver;

    Page1() {
        newInstance();
    }

    Page1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void newInstance() {
        driver = DriverSetUp.getDriver();
    }


    public void waitForElementPresents(By locator){
        new WebDriverWait(driver, WAIT_CONST).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitForElementEnabled(By locator){
        new WebDriverWait(driver, WAIT_CONST).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementVisible(By locator){
        new WebDriverWait(driver, WAIT_CONST).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void highlightElementOn(By locator){
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border = '4px solid green'",driver.findElement(locator));
    }

    public void highlightElementOff(By locator){
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border = '0px'",driver.findElement(locator));
    }

}

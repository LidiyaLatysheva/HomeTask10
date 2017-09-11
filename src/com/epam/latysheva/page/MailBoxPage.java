package com.epam.latysheva.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MailBoxPage extends Page1 {
    protected static String saveTime;
    protected static int emailCount;
    protected final static By EMAIL_IN_LIST = By.xpath("//div[@style='']/div[contains(@class, 'b-datalist_letters')]//a[@class=\"js-href b-datalist__item__link\"]");


    public MailBoxPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "PH_logoutLink")
    private WebElement logoutLink;

    public HomePage1 logout() {
        logoutLink.click();
        return new HomePage1();
    }

}

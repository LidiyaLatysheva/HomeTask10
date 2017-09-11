package com.epam.latysheva.page;

import com.epam.latysheva.businessObject.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InboxPage1 extends MailBoxPage {

    //@FindBy(xpath = "//*[@data-name=\"compose\"]")
    @FindBy(css = "a[data-name='compose']")
    private WebElement composeButton;

    public InboxPage1(WebDriver driver) {
        super(driver);
    }

    public ComposePage1 clickComposeBtn() {
        waitForElementEnabled(Constant.COMPOSE_BUTTON);
        composeButton.click();
        return new ComposePage1(driver);
    }

    public boolean isInboxPage() {
        waitForElementEnabled(Constant.COMPOSE_BUTTON);
        if (composeButton.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }
}


package com.epam.latysheva.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class InboxPage1 extends MailBoxPage {

    @FindBy(xpath = "//*[@data-name=\"compose\"]")
    private WebElement composeButton;

    public InboxPage1() {

    }

    public ComposePage1 clickComposeBtn() {
        composeButton.click();
        return new ComposePage1();
    }

    public boolean isInboxPage() {
        if (composeButton.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }
}


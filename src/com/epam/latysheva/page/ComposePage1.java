package com.epam.latysheva.page;

import com.epam.latysheva.businessObject.Constant;
import com.sun.tools.xjc.addon.code_injector.Const;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComposePage1 extends MailBoxPage {

    static Logger logger = LogManager.getLogger("Logger");

    @FindBy(xpath = "//textarea[@data-original-name=\"To\"]")
    private WebElement toField;

    @FindBy(name = "Subject")
    private WebElement subjectField;

    @FindBy(xpath = "//iframe[contains(@id, 'composeEditor')]")
    private WebElement iFrame;

    @FindBy(id = "tinymce")
    private WebElement bodyfield;

    @FindBy(xpath = "//*[@data-name=\"send\"]")
    private WebElement sendButton;

    public ComposePage1(WebDriver driver) {
        super(driver);
    }

    public ComposePage1 fillToField() {
        waitForElementEnabled(Constant.TO_FIELD);
        toField.sendKeys(Constant.EMAIL_DETAILS_TO);
        return this;
    }

    public ComposePage1 fillSubjectField() {
        waitForElementEnabled(Constant.SUBJECT_FIELD);
        subjectField.sendKeys(Constant.EMAIL_DETAILS_SUBJ);
        return this;
    }

    public ComposePage1 fillBodyField() {
        driver.switchTo().frame(iFrame);
        bodyfield.sendKeys(Constant.EMAIL_DETAILS_BODY);
        driver.switchTo().defaultContent();
        return this;
    }

    public boolean isComposePage() {
        if (sendButton.isEnabled()) {
            logger.info("isComposePage() true");
            return true;
        } else {
            logger.error("It is not Compose page: Send button i not enabled.");
            return false;
        }
    }

    public MailBoxPage clickSend() {
        sendButton.click();
        return new MailBoxPage(driver);
    }

}

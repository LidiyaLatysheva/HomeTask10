package com.epam.latysheva.page;


import com.epam.latysheva.businessObject.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 extends Page1 {

    public HomePage1() {
        PageFactory.initElements(driver, this);
    }

    public HomePage1(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "mailbox__login")
    private WebElement loginField;

    @FindBy(id = "mailbox__password")
    private WebElement passwordField;

    @FindBy(id = "mailbox__auth__button")
    private WebElement loginButton;

    public HomePage1 open() {
        driver.get(Constant.START_URL);
        return this;
    }

    public InboxPage1 login(String login, String password) {
        waitForElementEnabled(Constant.LOGIN_FIELD);
        loginField.sendKeys(login);
        waitForElementEnabled(Constant.PASSWORD_FIELD);
        passwordField.sendKeys(password);
        waitForElementEnabled(Constant.LOGIN_BUTTON);
        loginButton.click();
        return new InboxPage1(driver);
    }

    public boolean isHomePage() {
        if (loginButton.isEnabled() &
                loginField.isEnabled() &
                passwordField.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAfterLogout() {
        if (loginButton.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}

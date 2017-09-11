package com.epam.latysheva.page;


import com.epam.latysheva.businessObject.Constant;
import com.epam.latysheva.businessObject.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends Page1 {

    public HomePage1() {
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

    public InboxPage1 login(User user) {
        loginField.sendKeys(user.getLogin());
        passwordField.sendKeys(user.getPasswword());
        loginButton.click();
        return new InboxPage1();
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
    public boolean checkAfterLogout(){
        if (loginButton.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}

package com.epam.latysheva.test.steps;

import com.epam.latysheva.businessObject.Constant;
import com.epam.latysheva.util.Assertions;
import com.epam.latysheva.businessObject.User;
import com.epam.latysheva.page.ComposePage1;
import com.epam.latysheva.page.HomePage1;
import com.epam.latysheva.page.InboxPage1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.asserts.SoftAssert;


public class MailRuSimpleTest {


    HomePage1 homePage1 = new HomePage1();
    InboxPage1 inboxPage1;
    ComposePage1 composePage1;
    Assertions assertions = new Assertions();


    @Given("^Goto MailRu HomePage \"(.*)\"$")
    public void gotoEuroWingsHomePage(String url) {
        assertions.setSoftAssert(new SoftAssert());
        homePage1.open();
    }

    @When("^Login$")
    public void enterUserInfo() {
        inboxPage1 = homePage1.login(Constant.LOGIN, Constant.PASSWORD);
    }

    @Then("^Inbox page is opened$")
    public void verifyInboxPageOpened() {
        assertions.softAssertTrue(inboxPage1.isInboxPage(), "Inbox page is opened");
    }

    @When("^Click Compose button$")
    public void clickComposeButton() {
        composePage1 = inboxPage1.clickComposeBtn();
    }

    @When("^Enter email information$")
    public void enterMailInfo() {
        composePage1.fillToField();
        composePage1.fillSubjectField();
        composePage1.fillBodyField();
    }

    @When("^Click Send button$")
    public void sendEmail() {
        composePage1.clickSend();
    }

    @Then("^Email is sent$")
    public void isEmailSent(){
        assertions.softAssertTrue(composePage1.isEmailSent(),"Email is sent");
    }

    @When("^Log out from the Inbox$")
    public void logout() {
        homePage1 = composePage1.logout();
    }

    @Then("^Home page is opened$")
    public void verifyLogout() {
        assertions.softAssertTrue(homePage1.checkAfterLogout(),"Logout successfull");
        assertions.assertAll();
    }
}

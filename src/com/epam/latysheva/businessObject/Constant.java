package com.epam.latysheva.businessObject;


import org.openqa.selenium.By;

public class Constant {
    public static final String PATH_TO_GEKODRIVER = "lib/geckodriver.exe";
    public static final String PATH_TO_CHROMEDRIVER = "lib/chromedriver.exe";

    public static final String GECKO_DRIVER_SYSTEM_PROPERTY = "webdriver.gecko.driver";
    public static final String LOGIN = "lida.test.2017";
    public static final String PASSWORD = "$ERDFC5rtfgv";
    public static final String EMAIL_DETAILS_TO = "lida.test.2017@mail.ru";
    public static final String EMAIL_DETAILS_SUBJ = "TEST email";
    public static final String EMAIL_DETAILS_BODY = "Hello, dear!";

    public static final String CHECK_BODY_IS_THE_SAME_MSG = "FAIL: Body is different";
    public static final String CHECK_EMAIL_IS_SENT_MSG = "FAIL: Email is not sent";
    public static final String CHECK_EMAIL_IS_SAVED_MSG = "FAIL: Email is not saved";
    public static final String CHECK_EMAIL_IS_IN_DRAFTS_MSG = "FAIL: Check that email appears in Drafts failed";
    public static final String CHECK_EMAIL_IS_NOT_IN_DRAFTS_MSG = "FAIL: Check that email disappears from Drafts failed";
    public static final String CHECK_EMAIL_IS_IN_SENTS_MSG = "FAIL: Check that email appears in Sents failed";
    public static final String CHECK_SEND_BTN_PRESENT_FAILED_MSG = "FAIL: Check if Send button is on the page failed";
    public static final String CHECK_LOGOUT_MSG = "FAIL: Logout was unsuccessful";
    public static final String CHECK_EMAIL_COUNT_INCREASE_MSG = "FAIL: Email count hasn't been increased by 1";
    public static final String EMAIL_COUNT_AFTER_REFRESH_MSG = "FAIL: Email count is different after refresh";
    //Data
    public static final String START_URL = "https://mail.ru/";

    //protected static final String EMAIL_DETAILS_TO = "lida.test.2017@mail.ru";
    public static final String EMAIL_DETAILS_TO_CUT = "lida.test.2017";
    //protected static final String EMAIL_DETAILS_SUBJ = "TEST email";
    //protected static final String EMAIL_DETAILS_BODY = "Hello, dear!";
    public static final String EMAIL_SIGNATURE = "\n\n\n-Thank you!";
    public static final String SAVED_TO_DRAFT_MSG = "Сохранено в черновиках в";

    public static final int ELEMENT_WAITTIME = 10;
    public static final String BROWSER = "chrome";
    public static final String CHROME_DRIVER_PATH = ".\\src\\main\\resources\\drivers\\chromedriver.exe";




    //Locators:
    public static final By LOGIN_FIELD = By.id("mailbox__login");
    public static final By PASSWORD_FIELD = By.id("mailbox__password");
    public static final By LOGIN_BUTTON = By.id("mailbox__auth__button");
    public static final By COMPOSE_BUTTON = By.cssSelector("a[data-name='compose']");
    public static final By SEND_BUTTON = By.xpath("//*[@data-name=\"send\"]");
    public static final By DELETE_BUTTON = By.xpath("//*[@data-name=\"remove\"]");

    public static final By TO_FIELD = By.xpath("//textarea[@data-original-name=\"To\"]");
    public static final By SUBJECT_FIELD = By.name("Subject");
    public static final By BODY_FIELD_IFRAME = By.xpath("//iframe[contains(@id, 'composeEditor')]");
    public static final By BODY_FIELD = By.id("tinymce");
    public static final By SENT_LINK = By.cssSelector("a[href='/messages/sent/']");
    public static final By LOGOUT_LINK = By.id("PH_logoutLink");

}

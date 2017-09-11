package com.epam.latysheva.test.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(strict = false,
        features = {"src/com/epam/latysheva/test/resources/steps/"},tags = {"@MailRu"},
        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"})

public class CukesRunner extends AbstractTestNGCucumberTests {}
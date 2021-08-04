package com.cucumber.StepDefinitions;

import com.cucumber.Pages.TestPage1;
import demoCucumber.seleniumCucumber.BaseTest;
import io.cucumber.java.en.Given;

public class StepDef1 extends BaseTest {
    TestPage1 testCheck;

    @Given("I am on Google")
    public void launchGoogle() throws Throwable {
        testCheck = new TestPage1();
        testCheck.launchURL();
        System.out.println("I am here3");
    }

    @Given("I am on Amazon")
    public void launchAmazon() throws Throwable {
        testCheck = new TestPage1();
        testCheck.launchURL2();
    }
}

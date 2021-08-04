package com.cucumber.Runner;

import demoCucumber.seleniumCucumber.BaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/"
        , glue = {"com.cucumber.StepDefinitions"}
        , tags = {"@test2"}
        , plugin = {"json:target/cucumber-reports/Report2.json"},
        monochrome = true)

public class TestRunner2 extends BaseTest {
}



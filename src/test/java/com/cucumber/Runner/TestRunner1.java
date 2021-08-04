package com.cucumber.Runner;

import demoCucumber.seleniumCucumber.BaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/"
        , glue = {"com.cucumber.StepDefinitions"}
        , tags = {"@test"}
        , plugin = {"json:target/cucumber-reports/Report1.json"},
        monochrome = true)

public class TestRunner1 extends BaseTest {

}

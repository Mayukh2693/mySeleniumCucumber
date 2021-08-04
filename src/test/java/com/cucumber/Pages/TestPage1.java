package com.cucumber.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import demoCucumber.seleniumCucumber.BaseTest;

public class TestPage1 extends BaseTest {

	WebDriverWait wait;
	WebDriver driver = webDriver.get();

	public TestPage1() {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 90);
	}

	public void launchURL() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(5000);
	}
	public void launchURL2() throws InterruptedException {
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
	}
}

package demoCucumber.seleniumCucumber;

import java.io.IOException;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends AbstractTestNGCucumberTests {
	public WebDriver driver;
	protected static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	@BeforeTest
	public void driverInitialization() throws InterruptedException, IOException {
		driver = new SetBrowser().createDriver("chrome");
		webDriver.set(driver);
	}

	@AfterTest()
	public void stopDriver() {
		driver.quit();
	}

	// @AfterSuite for Integrations
}

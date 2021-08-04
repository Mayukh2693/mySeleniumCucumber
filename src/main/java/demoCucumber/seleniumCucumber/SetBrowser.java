package demoCucumber.seleniumCucumber;

import java.io.IOException;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetBrowser {
	 WebDriver driver;

	    public WebDriver createDriver(String Browser) throws InterruptedException, IOException {
	        switch (Browser) {
	            case "chrome":
	                WebDriverManager.chromedriver().arch64().setup();
	                ChromeOptions options = new ChromeOptions();
	                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	                options.addArguments("--incognito");
	                options.addArguments("--window-size=1920,1080");
	                options.addArguments("--disable-gpu");
	                options.addArguments("--disable-extensions");
	                options.setExperimentalOption("useAutomationExtension", false);
	                options.addArguments("--proxy-server='direct://'");
	                options.addArguments("--proxy-bypass-list=*");
	                options.addArguments("--start-maximized");
	                options.addArguments("--headless");
	                options.setHeadless(true);
	                System.setProperty("java.awt.headless", "true");
	                options.merge(capabilities);
	                driver = new ChromeDriver(options);
	                break;

	            default:
	                throw new NotFoundException("Invalid browser!");
	        }
	        driver.manage().window().maximize();
	        return driver;
	    }
}

package com.sqa.jf.auto;

import java.util.concurrent.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.*;
import org.testng.annotations.*;

public class BasicTest extends Core {

	public BasicTest(String baseUrl) {
		super(baseUrl);
	}

	@BeforeClass(enabled = false, groups = "chrome")
	public void setUpChrome() {
		System.out.println("Setup Chrome");
		// Set system property to use Chrome driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// Setup the driver to use Chrome
		setDriver(new ChromeDriver());
		// Set an implicit wait of up to 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		getDriver().manage().window().maximize();
	}

	@BeforeClass(enabled = true, groups = "firefox")
	public void setUpFirefox() {
		System.out.println("Setup Firefox");
		// Setup the driver to use IE
		setDriver(new FirefoxDriver());
		// Set an implicit wait of up to 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		getDriver().manage().window().maximize();
	}

	@BeforeClass(enabled = false, groups = "ie")
	public void setUpIE() {
		System.out.println("Setup IE");
		// Set capability of IE driver to Ignore all zones browser protected
		// mode settings.
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		// Set system property to use IE driver
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		// Initialize InternetExplorerDriver Instance using new capability.
		setDriver(new InternetExplorerDriver(caps));
		// Set an implicit wait of up to 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize the window
		getDriver().manage().window().maximize();
	}

	@BeforeMethod()
	public void setupTest() {
		// Goto Base URL
		// getDriver().get(getBaseURL());
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		// quit closes all instances of the browser.
		// getDriver().quit();
		// close method would close current instance only.
		// ex: driver.close();
	}
}

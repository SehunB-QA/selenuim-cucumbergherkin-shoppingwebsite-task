package com.qa.stepdefs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SelenuimWebDriver {
private static RemoteWebDriver driver;

@Before
public void setup()
{
	
	//Make sure to swap to an  exe while switching to Windows
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
	driver = new ChromeDriver(ChromeOptionsClass.chromeCfg());
}

@After
public void cleanUp()
{
	driver.quit();
	System.out.println("Web driver has been closed");
}

public static RemoteWebDriver getDriver()
{
	return driver;
}

}

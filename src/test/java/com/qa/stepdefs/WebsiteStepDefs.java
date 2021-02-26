package com.qa.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebsiteStepDefs {
	private static RemoteWebDriver driver;

	@Given("I can access {string}")
	public void i_can_access(String string) {

		driver = SelenuimWebDriver.getDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
		driver.get("http://" + string);
	}

	@Given("I click on the search bar and I enter {string} into the search bar")
	public void i_click_on_the_search_bar_and_i_enter_into_the_search_bar(String string) {
		  WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		  searchBar.sendKeys(string);
		  WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
		  searchButton.click();
	}

	
	@When("I click on the {string} search result")
	public void i_click_on_the_search_result(String string) {
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a\"")));
		 WebElement itemLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a"));
		 
		 itemLink.click();
	}

	@Then("I should be on a page of {string}")
	public void i_should_be_on_a_page_of(String string) {
		WebElement itemHeaderText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[4]/div/div/div/div[3]/h1"));
		assertEquals(string, itemHeaderText.getText());
	}

}

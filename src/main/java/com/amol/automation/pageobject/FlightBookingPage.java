package com.amol.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amol.automation.base.TestBase;

public class FlightBookingPage extends TestBase {

	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Welcome aboard']")
	public WebElement welcomeText;
	
	public FlightBookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void flightBooking() {
		Assert.assertTrue(welcomeText.isDisplayed(), "Welcome text is not displayed");
	}
}

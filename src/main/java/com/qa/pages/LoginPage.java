package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	/**
	 * 1. Locators:-->
	 */

	private By emailId = By.xpath("//input[@name='email' and @type='email']");
	private By passwordId = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//button[@id='submitBTN']");
	private By rememberMe = By.xpath("//input[@id='rememberchb']");

	/***
	 * 
	 * 2. Constructor
	 * 
	 */

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	/**
	 * 3. Page Actions: features (behavior) of the page
	 * 
	 */

	public String getLoginPageTitle() {

		return driver.getTitle();
	}

	public void enterUsername(String userName) {
		driver.findElement(emailId).sendKeys(userName);
	}

	public void enterPassword(String pwd) {
		driver.findElement(passwordId).sendKeys(pwd);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
		;
	}

}

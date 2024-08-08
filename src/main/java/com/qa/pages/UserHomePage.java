package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHomePage {

	private WebDriver driver;

	/**
	 * 1. Locators :
	 * 
	 */

	private By walletBalance = By.xpath(
			"//div[@class='col-lg-4 responsive-column-m user_wallet icon-layout-2 dashboard-icon-box'][1]/div/h1/strong");

	private By totalBookings = By.xpath(
			"//div[@class='col-lg-4 responsive-column-m user_wallet icon-layout-2 dashboard-icon-box'][2]/div/h1/strong");

	private By pendingInvoices = By.xpath(
			"//div[@class='col-lg-4 responsive-column-m user_wallet icon-layout-2 dashboard-icon-box'][3]/div/h1/strong");

	/**
	 * 
	 * 
	 * 2. Constructor
	 */

	public UserHomePage(WebDriver driver) {
		this.driver = driver;
	}

	
	
	/**
	 * 
	 * 3. Action methods
	 */
	
	public String getWalletBalance() {
		

		return driver.findElement(walletBalance).getText();
	}

	public String getTotalBookings() {

		return driver.findElement(totalBookings).getText();
	}

	public String getPendingInvoices() {
		return driver.findElement(pendingInvoices).getText();
	}

}

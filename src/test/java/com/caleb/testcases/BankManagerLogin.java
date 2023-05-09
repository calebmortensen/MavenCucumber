package com.caleb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.caleb.base.TestBase;

public class BankManagerLogin extends TestBase {

	@Test(priority = 1)
	public void loginAsBankManager() throws InterruptedException {

		log.debug("Inside BankManager Login Test");
		WebElement BankManagerLoginButton = driver.findElement(By.cssSelector(OR.getProperty("bmlBtn")));
		BankManagerLoginButton.click();
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "Login Not Successful");
		log.debug("Login Successfully Executed");
		Reporter.log("Login Successfully Executed");
		//Reporter.log("<a target=\"_blank\" href="path_to_Error.jpg">Screenshot</a>");
		/*
		 * Assert.assertEquals(true, BankManagerLoginButton.isDisplayed());
		/*
		 * driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		 * Thread.sleep(3000); log.debug("Login Successfully Executed");
		 */

	}

	@Test(priority = 2)
	public void AddCustomer() throws InterruptedException {
		WebElement AddCustomer = driver.findElement(By.cssSelector(OR.getProperty("addCustBtn")));
		Assert.assertEquals(true, AddCustomer.isDisplayed());
		AddCustomer.click();
		WebElement firstName = driver.findElement(By.cssSelector(OR.getProperty("firstName")));
		firstName.sendKeys("Caleb");
		Thread.sleep(3000);
		WebElement lastName = driver.findElement(By.cssSelector(OR.getProperty("lastName")));
		lastName.sendKeys("Mortensen");
		Thread.sleep(3000);
		WebElement postCode = driver.findElement(By.cssSelector(OR.getProperty("postCode")));
		postCode.sendKeys("92109");
		Thread.sleep(3000);
		WebElement addCustBtnSmall = driver.findElement(By.cssSelector(OR.getProperty("addCustBtnSmall")));
		addCustBtnSmall.click();
		Thread.sleep(3000);
		// add logic to address Alert Box and click 'OK'
		//String alert = "Customer added successfully with customer id";
		

	}

}

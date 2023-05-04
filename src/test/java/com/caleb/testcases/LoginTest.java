package com.caleb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.caleb.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		
			 	 
			  log.debug("Inside BankManager Login Test");
			  WebElement BankManagerLoginButton =
			  driver.findElement(By.cssSelector(OR.getProperty("bmlBtn")));
			  Assert.assertEquals(true, BankManagerLoginButton.isDisplayed());
			  BankManagerLoginButton.click();
			  driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
			  Thread.sleep(3000);
			  log.debug("Login Successfully Executed");
			 
		
				/*
				 * WebElement BankManagerLoginButton =
				 * driver.findElement(By.xpath(OR.getProperty("xbmlBtn")));
				 * Assert.assertEquals(true, BankManagerLoginButton.isDisplayed());
				 * BankManagerLoginButton.click(); Thread.sleep(3000);
				 */
		
	}

}

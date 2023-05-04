package com.caleb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.caleb.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		/*
		 * WebElement BankManagerLoginButton =
		 * driver.findElement(By.xpath("//button[contains(.,'Bank Manager Login')]"));
		 * Assert.assertEquals(true, BankManagerLoginButton.isDisplayed());
		 * BankManagerLoginButton.click();
		 */
		WebElement BankManagerLoginButton = driver.findElement(By.cssSelector(OR.getProperty("bmlBtn")));
		Assert.assertEquals(true, BankManagerLoginButton.isDisplayed());
		BankManagerLoginButton.click();
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		
	}

}

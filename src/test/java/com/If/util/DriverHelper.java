package com.If.util;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;



public abstract class DriverHelper {

	// Define objects
	public IOSDriver<MobileElement> driver;

	public PropertyReader propertyReader = new PropertyReader();
	public DriverHelper(IOSDriver<MobileElement> IOSDriver) {
		driver = IOSDriver;
		
	}
	
	

	// Handle locator type
	public By ByLocator(String locator) {
		By result = null;

		if (locator.startsWith("//")) {
			result = By.xpath(locator);
		} else if (locator.startsWith("css=")) {
			result = By.cssSelector(locator.replace("css=", ""));
		} else if (locator.startsWith("#")) {
			result = By.name(locator.replace("#", ""));
		} else if (locator.startsWith("link=")) {
			result = By.linkText(locator.replace("link=", ""));
		} else {
			result = By.id(locator);
		}
		return result;
	}

	// Assert element present
	public Boolean isElementPresent(String locator) 
	{
		waitForLoad(2000);
		Boolean result = false;
		try {
			driver.findElement(ByLocator(locator));
			result = true;
		} catch (Exception ex) {
		}
		return result;
	}
	
	// Assert element present
	public Boolean isElementVisible(String locator) 
	{
		waitForLoad(2000);
		Boolean result = false;
		try {
			driver.findElement(ByLocator(locator)).isDisplayed();
			result = true;
		} catch (Exception ex) {
		}
		return result;
	}
	


	// Handle click action
	public void clickOn(String locator) {
		waitForLoad(2000);
		WebElement el = driver.findElement(ByLocator(locator));
		el.click();
	}

	// Handle send keys action
	public void sendKeys(String locator, String text) {
		waitForLoad(2000);
		WebElement el = driver.findElement(ByLocator(locator));
		el.clear();
		el.sendKeys(text);
	}

	// Generate a random number
	public int randomNumber(int number)
	{
		Random ran = new Random();
		int i = ran.nextInt(number);
		return i;
	}

	// Hide KeyPad button
	public void hideKeyPad()
	{	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//getDriver().hideKeyboard();
		driver.navigate().back();
	}

	// MoveToElement
	public void moveToElement(String locator)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(ByLocator(locator))).build().perform();
	}	

	// wait For Load
	public void waitForLoad(int time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Scroll Down the window to specific text
		public void scroll(String key)
		{
			try {
				Thread.sleep(900);
				Runtime.getRuntime().exec(new String[] {propertyReader.readApplicationFile(key), "shell", "input", "keyevent", "20"});
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}

		// Scroll the screen
		public void scrollDown()
		{
			scroll("JavaPath");
		}
		
		// scroll down until the element not found
		public void scrollUntilElementFound(String locator)
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			boolean flag = isElementPresent(locator);
			if(flag==false)
			{
				for(int i =1;i<=10;i++)
				{
					scrollDown();
					flag = isElementPresent(locator);
					if(flag==true)
					{
						break;
					}
				}
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		//wait for element to present
		public void waitForElementPresent(String locator, int time)
		{
			try {
				for(int i=1; i<=time; i++)
				{
					if(isElementPresent(locator))
						break;
					else
						Assert.fail(locator +" is not found in given time " +time);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public void Allow()
		{
			//Check if location access pop u p is present
			if(isElementVisible("#Allow"))
			{
				clickOn("#Allow");
				waitForLoad(2000);
			}
		}
}

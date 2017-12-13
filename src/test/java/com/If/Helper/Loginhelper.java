package com.If.Helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.If.util.DriverHelper;
import com.If.util.LocatorReader;

//public class Login extends com.If.util.Drivertestcase 

public class Loginhelper  extends DriverHelper
{
	private LocatorReader loginLoc;
	public Loginhelper(IOSDriver<MobileElement> IOSDriver) {
		super(IOSDriver);
		
		loginLoc = new LocatorReader("LoginINF.xml");
		// TODO Auto-generated constructor stub
	}

	
	public void Notnow()
	{
		waitForLoad(2000);
	clickOn(loginLoc.getLocator("Login.DontUpdate"));
	}
	public void tapSoundsgood()
	{
		waitForLoad(3000);
		clickOn(loginLoc.getLocator("Login.soundsGood"));
		
	}
	
	public void Tapok()
	{
		waitForLoad(1000);
		clickOn(loginLoc.getLocator("Login.Ok"));
		
	}
	public void Alert()
	{
		
		waitForLoad(2000);
		clickOn(loginLoc.getLocator("Login.Allow"));
	}
	
	public void setting()
	{
		
		waitForLoad(2000);
		clickOn(loginLoc.getLocator("Login.Setting"));
	}
	
	public void Logout()
	{
		waitForLoad(2000);
		
		//((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));");
		//scrollUntilElementFound(loginLoc.getLocator("Login.Logout"));
		TouchAction touchAction4 = new TouchAction(driver);
	    touchAction4.press(30,243).moveTo(89,51).release();
	    driver.performTouchAction(touchAction4);
		waitForLoad(1000);
		clickOn(loginLoc.getLocator("Login.Logout"));
		
	}
	// Tap on the SignIn button
	
	public void tapOnHome()
	{
		waitForLoad(1000);
		clickOn(loginLoc.getLocator("Login.Home"));
	}

	public void tapOnAllow()
	{
		waitForLoad(5000);
		clickOn(loginLoc.getLocator("Login.Allow"));
	}
	
	
		public void tapOnLogXID()
		{
			clickOn(loginLoc.getLocator("Login.Loginbutton"));
		}

		// Enter xID 
		public void enterXID(String xIDNumber)
		{
			System.out.println(xIDNumber);
			clickOn(loginLoc.getLocator("Login.xIDNumber"));
			sendKeys(loginLoc.getLocator("Login.xIDNumber"),xIDNumber);
		}

		// Enter Passcode
		public void enterPasscode(String passcodeNumber)
		{
			sendKeys(loginLoc.getLocator("Login.passcodeNumber"),passcodeNumber);
		}

		// Tap on the SignIn button
		public void tapOnSignIn()
		{
			clickOn(loginLoc.getLocator("Login.SignInbtn"));
		}

		//Verify user is logged
		public void verifyUserLoggedIn()
		{
			waitForElementPresent(loginLoc.getLocator("Login.App"), 10);
			boolean flag = isElementPresent(loginLoc.getLocator("Login.App"));
			Assert.assertTrue(flag, "User is logged into application");
			clickOn(loginLoc.getLocator("Login.App"));
		}
		
		// Verify validation message for invalid credentials
		public void verifyValidationMessage()
		{
			Assert.assertTrue(isElementPresent(loginLoc.getLocator("Login.Message")), "Validation message does not appear");
		}
	
	IOSDriver<MobileElement> driver;
	
	
}

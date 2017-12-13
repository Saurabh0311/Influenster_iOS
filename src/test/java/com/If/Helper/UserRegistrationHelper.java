package com.If.Helper;


import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.If.util.DriverHelper;
import com.If.util.LocatorReader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class UserRegistrationHelper extends DriverHelper{

	private LocatorReader signupLoc;

	public UserRegistrationHelper(IOSDriver<MobileElement> IOSDriver) 
	{
		super(IOSDriver);	
		signupLoc = new LocatorReader("SignUp.xml");
	}

	public void Notnow()
	{
		waitForLoad(1000);
		clickOn(signupLoc.getLocator("SignUp.DontUpdate"));
	}
	// Tap on the Sign Up button
	public void tapOnSignUp()
	{
		clickOn(signupLoc.getLocator("SignUp.SignupBtn"));
	}

	// Enter unique xID number into xID field

	// Tap on the Next button

	// Enter the Email Id
	public void enterEmailID()
	{
		clickOn(signupLoc.getLocator("SignUp.Email"));
		int rNumber = randomNumber(1000);
		String randomNumber = Integer.toString(rNumber);
		waitForLoad(1000);
		sendKeys(signupLoc.getLocator("SignUp.Email"),"Infiapp"+randomNumber+"@gmail.com");
	}

	// Enter the FirstName
	
	// Enter the Passcode
	public void enterPasscode()
	{
		sendKeys(signupLoc.getLocator("SignUp.Passcode"),"1234");
	}


	
	// Check the Agree checkbox
	public void tapOnAgreeCheckbox()
	{
		
		clickOn(signupLoc.getLocator("SignUp.AgreeCheckbox"));
	}
	
	// Tap on the Submit Button
	public void tapSubmit()
	{
		clickOn(signupLoc.getLocator("SignUp.SubmitBtn"));
		
	}
	
	public void tapSoundsgood()
	{
		waitForLoad(7000);
		clickOn(signupLoc.getLocator("SignUp.Soundgood"));
		
	}
	
	public void Tapok()
	{
		waitForLoad(1000);
		clickOn(signupLoc.getLocator("SignUp.Ok"));
		
	}
	public void Alert()
	{
		
		waitForLoad(1000);
		clickOn(signupLoc.getLocator("SignUp.Notification"));
	}
	
	public void TapyesIam()
	{
		
		waitForLoad(2000);
		clickOn(signupLoc.getLocator("SignUp.Yes"));
	}
	
	public void Tapyesbtn()
	{
		
		waitForLoad(2000);
		clickOn(signupLoc.getLocator("SignUp.Noskip"));
	}
	
	public void Skipinsta()
	{
		
		waitForLoad(1000);
		clickOn(signupLoc.getLocator("SignUp.Skipinsta"));
	}
	
	public void SkipFb()
	{
		
		waitForLoad(1000);
		clickOn(signupLoc.getLocator("SignUp.SkipFb"));
	}
	
	public void Doneconnecting()
	{
		
		waitForLoad(1000);
		clickOn(signupLoc.getLocator("SignUp.Doneconnecting"));
	}
	
	public void Firstname()
	{
		sendKeys(signupLoc.getLocator("SignUp.Firstname"),"Deepak");
	}
	
	
	public void Lastname()
	{
		sendKeys(signupLoc.getLocator("SignUp.Lastname"),"yadav");
	}
	
	public void Nextbtn()
	{
		clickOn(signupLoc.getLocator("SignUp.Next"));
	}
	
	public void Postalcode()
	{
		sendKeys(signupLoc.getLocator("SignUp.Postalcode"),"1234");
	}
	
	public void Nextzip()
	{
		clickOn(signupLoc.getLocator("SignUp.Nextzip"));
	}
	
	public void skipdob()
	{
		clickOn(signupLoc.getLocator("SignUp.Skipdob"));
	}
	
	public void Gender()
	{
		clickOn(signupLoc.getLocator("SignUp.Gender"));
	}
	
	public void Nextgender()
	{
		clickOn(signupLoc.getLocator("SignUp.Nextgender"));
	}
	
	public void Allow()
	{
		clickOn(signupLoc.getLocator("SignUp.Allow"));
	}
	
	public void setting()
	{
		clickOn(signupLoc.getLocator("SignUp.Setting"));
	}
	
	
	public void logout()
	{
		
		waitForLoad(4000);
		clickOn(signupLoc.getLocator("SignUp.Logout"));
	}
	
	// Verify user is on SignUp screen
	public void verifyUserOnSignUPScreen()
	{
		Assert.assertTrue(isElementPresent(signupLoc.getLocator("SignUp.SignupBtn")));
	}
}
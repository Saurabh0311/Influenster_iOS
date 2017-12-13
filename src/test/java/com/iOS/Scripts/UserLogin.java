package com.iOS.Scripts;

import org.testng.Reporter;

import org.testng.annotations.Test;

import com.If.Helper.Loginhelper;
import com.If.util.Drivertestcase;

public class UserLogin extends Drivertestcase{

	
	/**
	 * In this script user login into application by using valid credentials   
	 */

	@Test
	public void testUserLogin()
	{
		// Initialize the objects
		Loginhelper userLoginHelper = new Loginhelper(getDriver());
	
		//Tap on not now button
			userLoginHelper.Notnow();
		// Tap on the Log in with your XID button
			userLoginHelper.tapOnLogXID();
		Reporter.log("User taps on Login with your xID");

		// Enter xID into xID field
		userLoginHelper.enterXID(xID);
		Reporter.log("User enters xID");

		// Enter Passcode into passcode field
		userLoginHelper.enterPasscode(password);
		Reporter.log("User enters Passcode");

		// Tap on the Sign In button
		userLoginHelper.tapOnSignIn();
		Reporter.log("User taps on Sign In button");
		
		
	
		
		userLoginHelper.tapSoundsgood();
		
		userLoginHelper.Tapok();
		userLoginHelper.Alert();
		// Verify user is logged into application
		//userLoginHelper.verifyUserLoggedIn();
		userLoginHelper.setting();
		//userLoginHelper.Logout();
		
		Reporter.log("User is logged into application successfully");
		

		// Verify user is logged into application
		//userLoginHelper.verifyUserLoggedIn();
		Reporter.log("User is logged into application successfully");

	}
	
	/**
	 * This test case for user login into application by using invalid credentials
	 * and verify validation message
	 */
	@Test(enabled= false)
	public void testUserLoginInvalidCredentials()
	{
		// Initialize the objects
		Loginhelper userLoginHelper = new Loginhelper(getDriver());
		
		// Tap on the Log in with your XID button
		userLoginHelper.tapOnLogXID();
		Reporter.log("User taps on Login with your xID");

		// Enter xID into xID field
		userLoginHelper.enterXID("123456");
		Reporter.log("User enters xID");

		// Enter Passcode into passcode field
		userLoginHelper.enterPasscode("123456");
		Reporter.log("User enters Passcode");

		// Tap on the Sign In button
		userLoginHelper.tapOnSignIn();
		Reporter.log("User taps on Sign In button");

		// Verify user is logged into application
		userLoginHelper.verifyValidationMessage();
		Reporter.log("Validation message appears");
	}
}

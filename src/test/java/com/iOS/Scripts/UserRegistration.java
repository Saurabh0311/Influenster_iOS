package com.iOS.Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.If.Helper.UserRegistrationHelper;
import com.If.util.Drivertestcase;

public class UserRegistration  extends Drivertestcase{

	/**
	 * Influenster registration
	 * In this script we have registered a new user by entering all valid information   
	 */

	@Test
	public void testUserRegistration()
	{
		
		
		// Initialize the objects
		UserRegistrationHelper userRegistration = new UserRegistrationHelper(getDriver());
        //Not now
		userRegistration.Notnow();
		
		// Tap on the Sign Up Button
		userRegistration.tapOnSignUp();
		Reporter.log("User taps on create account button");
	
		
		// Tap on the Next button
		//userRegistration.tapOnNext();
		//Reporter.log("User taps on Next button");
		
		// Enter the Email Address into Email text field
		userRegistration.enterEmailID();
		Reporter.log("User enters email id");
		
	

		// Enter the Passcode into Passcode text field
		userRegistration.enterPasscode();
		Reporter.log("User enters Passcode");

		// Enter the Confirm Passcode into Confirm Passcode text field
		
		
		// Check the Agree check box
		userRegistration.tapOnAgreeCheckbox();
		Reporter.log("User select Agree checkbox");
		
		// Tap on the submit button
		userRegistration.tapSubmit();
		
		
		//userRegistration.Tapok();
		
		userRegistration.tapSoundsgood();
		Reporter.log("User taps on soundsgood");
		
		userRegistration.Tapok();
		
		//userRegistration.Alert();
		//Reporter.log("User taps on alert pop-up");
		
		userRegistration.TapyesIam();
		Reporter.log("User taps on the yes iamin");
		
		//userRegistration.Tapyesbtn();
		
		
		userRegistration.Skipinsta();
		Reporter.log("User taps on the skip Instagram button");
		
		userRegistration.SkipFb();
		Reporter.log("User taps on the skip Facebook button");
		
		userRegistration.Doneconnecting();
		Reporter.log("User taps on done connecting");
		
		userRegistration.Firstname();
		Reporter.log("User writes his/her firstname");
		
		userRegistration.Lastname();
		Reporter.log("User writes his/her Lastname");
		
		userRegistration.Nextbtn();
		Reporter.log("User taps on next button");
		
		userRegistration.Postalcode();
		Reporter.log("User taps on postalcode");
		
		userRegistration.Nextzip();
		Reporter.log("User taps on Nextzip");
		
		userRegistration.skipdob();
		Reporter.log("User taps on skipdob");
		
		userRegistration.Gender();
		Reporter.log("User taps on Gender");
		
		userRegistration.Nextgender();
		Reporter.log("User taps on nextgender");
		
		userRegistration.Allow();
		Reporter.log("User taps on allow");
		
		userRegistration.setting();
		Reporter.log("User taps on setting");
		
		//userRegistration.scrollToElement(driver, elementName);
		userRegistration.logout();
		
	}
	
	
	//@Test
	public void testCancelBtnOnRegistration()
	{
		// Initialize the objects
		UserRegistrationHelper userRegistration = new UserRegistrationHelper(getDriver());

		// Tap on the Sign Up Button
		userRegistration.tapOnSignUp();
		Reporter.log("User taps on Sign Up button");

		// Tap on the Cancel Button
		//userRegistration.tapOnCancel();
		//Reporter.log("User taps on Cancel button");
		
		// Verify user is on Main page
		userRegistration.verifyUserOnSignUPScreen();
		Reporter.log("Main screen is displayed on tapping on Cancel button");
		
	}
}

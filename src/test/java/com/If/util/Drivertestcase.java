package com.If.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.If.util.PropertyReader;

public class Drivertestcase {

	
	//public static IOSDriver driver;
	
	private static IOSDriver<MobileElement> driver ;
	//private static AppiumDriver driver ;
	PropertyReader propertyReader = new PropertyReader();
	public String xID= propertyReader.readApplicationFile("xID");
	public String password= propertyReader.readApplicationFile("Password");
	 
	@BeforeSuite
	 public void setUp() throws MalformedURLException {
		 String path= System.getProperty("user.dir");
		 System.out.println(path);
	 DesiredCapabilities caps = new DesiredCapabilities ();
	 caps.setCapability("platformName", "iOS");
	 caps.setCapability("platformVersion", "9.3"); 
	caps.setCapability("deviceName", "iPhone 6");
	 //caps.setCapability("udid", "f4c37397743dd978769ad8d44c848b1e0fd41b4d");
	 caps.setCapability("app", path+"/app/Influenster.app"); 
	 caps.setCapability("automationName", "XCUITest");
	// driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	
	 try{
		 driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	 }
		
			catch (Exception ex)
		{
			
		}

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public IOSDriver<MobileElement> getDriver()
	{
		return driver;
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
	
	
	
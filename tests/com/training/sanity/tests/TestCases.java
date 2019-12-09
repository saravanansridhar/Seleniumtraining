package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestCases {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
		loginPOM.selectdropdown();
		loginPOM.sendUserName("saravanansridhar@yahoo.com");
		loginPOM.sendPassword("Sneha123");
		loginPOM.clickLoginBtn(); 
	}
	
		
	@Test(enabled=false)
	public void tc1_UFM_005_modifyPersonaldetails() {
		loginPOM.clickAcctLink();
		loginPOM.ChangeAcctDetails("Neha","B","neha99887@gmail.com","9742232323");
		loginPOM.clickContBtn();
		System.out.println("Account details changed successfully");
		}
	
	@Test()
	public void tc2_UFM_006_ChangePassword() {
		
		loginPOM.clickChgPwdLink();
		loginPOM.changePwdDetails("test123","test123");
		loginPOM.clickContPwdChg();
		 System.out.println("Password changed successfully");
		
	}
	
	@Test()
public void tc3_UFM_007_ValidateErrorMessageforChangePassword() throws InterruptedException {
		
		loginPOM.clickChgPwdLink();
		loginPOM.changePwdDetails("test123","test23");
		loginPOM.clickContPwdChg();
		
		Thread.sleep(3000);
		
		loginPOM.validateErrorMsgForPwdChg("Password confirmation does not match password!");
		
		
		
	}
	
	
	
	

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
		
	
}

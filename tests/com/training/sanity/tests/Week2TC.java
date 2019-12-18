package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Week2POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class Week2TC {
	

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private Week2POM week2test;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		week2test = new Week2POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);		
		
	}
	
@Test
	public void placeOrderasGuest() throws InterruptedException {
		week2test.clickShopUniformBtn();
		Thread.sleep(1000);
		week2test.clickTShirt();
		Thread.sleep(1000);
		week2test.selectdropdown();
		week2test.clickAddCartBtn();
		week2test.clickCartIconBtn();
		week2test.clickCheckOutBtn();
		week2test.clickGuestRadioBtn();
		week2test.clickContBtn();
		week2test.Billingdetials();
		week2test.clickContBtn2();
		week2test.enterText();
		
		week2test.clickContBtn3();
		Thread.sleep(2000);
		week2test.clickchckBox();
		week2test.clickpaymtBtn();
		week2test.clickconfirmBtn();
		screenShot.captureScreenShot();
		
		}

}

package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Week2POM {
private WebDriver driver; 
	
	public Week2POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//img[@alt='banner1']") WebElement shopUniformBtn;	
	
	@FindBy(xpath="//img[@alt='REGULAR T-SHIRTS (Rust)']") WebElement selectTShirt;
	
	@FindBy(id="input-option376") WebElement sizedropDown;
	
	@FindBy(id="button-cart") WebElement AddCartBtn;
	
	@FindBy(xpath="//button[@type='button']") WebElement CartIconBtn;
	
	@FindBy(xpath="//strong[contains(.,' Checkout')]") WebElement CheckOutBtn;
	
	@FindBy(xpath="//input[@value='guest']") WebElement guestradioBtn;
	
	@FindBy(id="button-account") WebElement ContBtn;
	
	@FindBy(id="input-payment-firstname") WebElement firstName; 
	@FindBy(id="input-payment-lastname") WebElement lastName; 
	@FindBy(id="input-payment-email") WebElement email; 
	@FindBy(id="input-payment-telephone") WebElement phone; 
	@FindBy(id="input-payment-address-1") WebElement add1; 
	@FindBy(id="input-payment-city") WebElement city; 
	@FindBy(id="input-payment-postcode") WebElement postCode; 
	@FindBy(id="input-payment-zone") WebElement statedropdown;
	@FindBy(id="button-guest") WebElement contBillAddbtn;
	
	@FindBy(name="comment") WebElement commentSection;
	@FindBy(id="button-shipping-method") WebElement shipBtn;
	
	@FindBy(xpath="//div[5]/div[2]/div/div[2]/div/input") WebElement chckBox;
	
	@FindBy(id="button-payment-method") WebElement paymtBtn;
	
	@FindBy(id="button-confirm") WebElement confirmBtn;
	
	
	
	
	
	
	

	public void clickchckBox() {
		this.chckBox.click();
	}
	

	public void clickpaymtBtn() {
		this.paymtBtn.click();
	}
	
	public void clickconfirmBtn() {
		this.confirmBtn.click();
	}
	
	
	public void Billingdetials() 
	{	
		this.firstName.sendKeys("test");
		this.lastName.sendKeys("tes");
		this.email.sendKeys("test@gmail.com");
		this.phone.sendKeys("8877665543");
		this.add1.sendKeys("testing123");
		this.city.sendKeys("bangalore");
		this.postCode.sendKeys("560029");
	 
		Select dropdwn = new Select(this.statedropdown);
		dropdwn.selectByValue("1489");
		
	}
	
	
	public void clickShopUniformBtn() {
		this.shopUniformBtn.click();
	}
	
	public void clickTShirt() {
		this.selectTShirt.click();
	}
	
	public void selectdropdown() throws InterruptedException {
		Select dropdownOption = new Select(this.sizedropDown) ;
		dropdownOption.selectByValue("969");
		}  
	
	public void clickAddCartBtn() {
		this.AddCartBtn.click();
	}
	
	public void clickCartIconBtn() {
		this.CartIconBtn.click();
	}
	
	public void clickCheckOutBtn() {
		this.CheckOutBtn.click();
	}
	
	public void clickGuestRadioBtn() {
		this.guestradioBtn.click();
	}
	public void clickContBtn() {
		this.ContBtn.click();
	}
	public void clickContBtn2() {
		this.contBillAddbtn.click();
	}
	
	public void enterText() {
		
		this.commentSection.sendKeys("For testing purpose");
	}
	
public void clickContBtn3() {
		
		this.shipBtn.click();;
	}
	
	
	
	
	
}


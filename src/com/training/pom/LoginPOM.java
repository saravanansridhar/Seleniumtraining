package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//div[@id='top-links1']/ul/li[3]/a/i")
	private WebElement dropDownBtn1;
	
	@FindBy(xpath="/html/body/nav/header/div/div[3]/div/ul/li[3]/ul/li[2]")
	private WebElement dropDownBtn2;
	
	@FindBy(xpath="/html/body/div[1]/div/div/ul[2]/li[1]/a")
	private WebElement editAcctLink;
	

	@FindBy(id="input-firstname")
	private WebElement firstName; 
	

	@FindBy(id="input-lastname")
	private WebElement lastName; 
	
	@FindBy(id="input-email")
	private WebElement email; 
	
	@FindBy(id="input-telephone")
	private WebElement phone; 
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement contBtn;
	
	
	@FindBy(xpath="//a[contains(text(),'Change your password')]")
	private WebElement ChgPwdLink;
	


	@FindBy(id="input-password")
	private WebElement EnterNewPwd;
	

	@FindBy(id="input-confirm")
	private WebElement EnterNewPwdAgain;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement ContPwdChg;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset/div[2]/div/div")
	private WebElement ErrorMessageForPwd ;
	
	
		public void selectdropdown() throws InterruptedException {
			
		this.dropDownBtn1.click();
		Thread.sleep(5000);
		//Select dropdownOption = new Select(this.dropDownBtn2) ;
		//dropdownOption.selectByVisibleText("Login");
		this.dropDownBtn2.click();
		Thread.sleep(5000);		
	}  
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickAcctLink() {		
		this.editAcctLink.click();
	}
	

	public void ChangeAcctDetails(String firstName, String lastName , String email , String phone)
	{
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
		this.email.clear();
		this.email.sendKeys(email);
		this.phone.clear();
		this.phone.sendKeys(phone);
			
	}
	
	public void clickContBtn() {
		this.contBtn.click();
	}
	
	public void clickChgPwdLink() {		
		this.ChgPwdLink.click();
	}
	
	public void changePwdDetails(String EnterNewPwd, String EnterNewPwdAgain )
	{
		this.EnterNewPwd.sendKeys(EnterNewPwd);
		this.EnterNewPwdAgain.sendKeys(EnterNewPwdAgain);
	}
	
	public void clickContPwdChg() {		
		this.ContPwdChg.click();
	
	}
	
	public void validateErrorMsgForPwdChg(String expectedError) {
		
	String actualError = this.ErrorMessageForPwd.getText();
				
		Assert.assertEquals(actualError , expectedError, "Error message is not Matching");
	}
}

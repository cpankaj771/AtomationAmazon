package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogIn {

	@FindBy (xpath = "//input[@type='email']") 
	private WebElement phonenumber;
		 
	@FindBy (xpath = "//input[@id='continue']") 
	private WebElement continue1;
		 
	@FindBy (xpath = "//input[@type='password']") 
	private WebElement password;
		 
	@FindBy (xpath = "//input[@id='signInSubmit']") 
	private WebElement signInSubmit;
		 
	public  AmazonLogIn(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendphonenumber(String phone) 
	{
		phonenumber.sendKeys(phone);
	}
	public void clickoncontinue1() 
	{
		continue1.click();
	}
	public void  sendpassword(String pass) 
	{
		password.sendKeys(pass);
	}
	public void clickonsignInSubmit() 
	{
		signInSubmit.click();
	}



	

	}
	
	




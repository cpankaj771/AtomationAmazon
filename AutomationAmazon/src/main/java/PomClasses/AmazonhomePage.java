package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonhomePage {
	@FindBy (xpath = "//a[text()='Gift Cards']") 
	private WebElement giftcard;
		 
	@FindBy (xpath = "//a[text()='Amazon Pay']") 
	private WebElement amazonpay;
		 
	@FindBy (xpath = "//a[text()='All Mobile Phones']") 
	private WebElement allmobile ;
	
	@FindBy (xpath = "(//a[@role='button'])[1]") 
	private WebElement all ;
		 
	@FindBy (xpath ="//a[text()='Sign Out']") 
	private WebElement signout ;
	
		 
	public AmazonhomePage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void clickongiftcard() 
	{
		
		giftcard.click();
	}
	public void clickonamazonpay() 
	{
		amazonpay.click();
	}
	public void clickonallmobile() 
	{
		allmobile.click();
	}
	public void clickonall(){
		all.click();
	}
	public void ClickOnsignout() {
		signout.click();
	}

	
	
	
	
	
	
	
	
	
}

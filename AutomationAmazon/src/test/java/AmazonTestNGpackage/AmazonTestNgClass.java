package AmazonTestNGpackage;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.Base;
import PomClasses.AmazonLogIn;
import PomClasses.AmazonhomePage;
import Utils.Utility;

public class AmazonTestNgClass {
	
	WebDriver driver;
	AmazonhomePage homepage;
	AmazonLogIn login ;
	@Parameters("browserName")
	@BeforeTest
	public void launchbrowser(String browser) {
		System.out.println(browser);
		if (browser.equals("Chrome")) 
		{
			driver =Base.openChromeBrowser();
		}
		if(browser.equals("Firefox"))
		{
			driver = Base.openFirefoxBrowser();
		}
		if(browser.equals("Opera")) 
		{
			driver =Base.openOperaBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	} 
	@BeforeClass
	public void createPOMobject() {
		homepage = new AmazonhomePage(driver);
		login = new AmazonLogIn(driver);
	}
	@BeforeMethod
	public void LoginToApplication() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		login = new AmazonLogIn(driver);
		String data  = Utility.getDatafromexcelsheet(1, 0);
		login.sendphonenumber(data);
		
		login.clickoncontinue1();
		
		data = Utility.getDatafromexcelsheet(1, 1);
		login.sendpassword(data);
		login.clickonsignInSubmit();
		Thread.sleep(2000);
		 homepage = new AmazonhomePage(driver);
		 
		 
	}
	@Test(priority=1)
	public void VerifyGiftcardTab() throws InterruptedException
	{
		homepage.clickongiftcard();
		String url = driver.getCurrentUrl();
		Thread.sleep(5000);
		String title = driver.getTitle();
		
		Assert.assertEquals("https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc",url);
		Assert.assertEquals("Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in",title);
			
	}
	@Test(priority=2)
	public void VerifyAmazonPayTab() throws InterruptedException
	{
		 homepage.clickonamazonpay();
			
		 String url = driver.getCurrentUrl();
		Thread.sleep(2000);
		String title = driver.getTitle();
		
		Assert.assertEquals("https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay",url);
		Assert.assertEquals("Amazon Pay",title);
		
	}
	
	@AfterMethod
	public void LogoutFromAppliaction(ITestResult result) throws InterruptedException, IOException  
	{
		if(ITestResult.FAILURE ==result.getStatus())
		{
			Utility.captureScreenshot(driver, 101);
		}
		Thread.sleep(5000);
		 homepage.clickonall();
		 Thread.sleep(5000);
		 homepage.ClickOnsignout();
	}	 
	@AfterClass
	public void clearObject() 
	{
		login = null;	
		homepage = null;
	}
	
	@AfterTest
	public void closedBrowser()
	{
		driver.close();
		driver = null;
		System.gc();
	}
}




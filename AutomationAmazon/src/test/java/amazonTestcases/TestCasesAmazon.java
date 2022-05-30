/*package amazonTestcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.AmazonLogIn;

import PomClasses.AmazonhomePage;

public class TestCasesAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\realme\\application file\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
       
		///1st test case
		
		AmazonLogIn login = new AmazonLogIn(driver);
		
		login.sendphonenumber();
		login.clickoncontinue1();
		login.sendpassword();
		login.clickonsignInSubmit();
		Thread.sleep(2000);
		AmazonhomePage homepage = new AmazonhomePage(driver);
		homepage.clickongiftcard();
		
		
		
		 

		String url = driver.getCurrentUrl();
		Thread.sleep(5000);
		String title = driver.getTitle();
		
		if(url.equals("https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc")&& title.equals("Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(5000);
		 homepage.clickonall();
		 Thread.sleep(5000);
		 homepage.ClickOnsignout();
		
		///2nd test case
		
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        Thread.sleep(2000);
		login.sendphonenumber();
		login.clickoncontinue1();
		login.sendpassword();
		login.clickonsignInSubmit();
		
		 homepage = new AmazonhomePage(driver);
		 homepage.clickonamazonpay();
		
		
		 url = driver.getCurrentUrl();
		Thread.sleep(2000);
		 title = driver.getTitle();
		
		if(url.equals("https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay")&& title.equals("Amazon Pay")) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(5000);
		 homepage.clickonall();
		 Thread.sleep(5000);
		 homepage.ClickOnsignout();
		
		
	
	}

}*/

package AmazonTestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestNgclasses2 {
	@BeforeSuite
	 public void beforeSuite() 
	    {
		System.out.println("Before suit");
	    }
    @BeforeTest
    public void beforeTest() 
    {
	System.out.println("Before test");
    }
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void testA()
	{
		System.out.println("test A TestClass 2");
	}
	
	@Test
	public void testB() 
	{
		System.out.println("test B TestClass 2");
	
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("After suite");
	}
	
	
}

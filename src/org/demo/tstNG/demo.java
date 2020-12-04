package org.demo.tstNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {
//***********************************all about annotations***********************************	
	/*WebDriver driver;
	
	@BeforeSuite//annotation
	public void b4suite()
	{
		System.out.println("b4suite");
		}
	
	@BeforeTest
	public void b4test()
	{
		System.out.println("b4test");
	}
	
	@BeforeClass
	public void beforC()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		System.out.println("B4Class");
	}
	
	@BeforeMethod
	public void berforM() throws InterruptedException{
	

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	String url = "https://www.google.com/";
	driver.get(url);
	Thread.sleep(1000);
	}
	
	@Test
	public void TC_01() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(1000);
		
	}
	
	@Test
	
	public void TC_02() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfj']")).sendKeys("java");  //wrong xpath
		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void afterM()
	{
		driver.close();
	}
	
	@AfterClass
	public void afterC()
	{
		System.out.println("afterC");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	@AfterSuite
	public void aftertsuite()
	{
		System.out.println("aftersuite");
		}
	*/
	//*************************************************invocation count****************************
	/*@Test(invocationCount=5)// no of times the test will execute, if invocation count is 0 xml will not execute it
	public void TC_01() 
	{
		
		System.out.println("hi");
		
	}*/
//**********************************************priority*********************************************************
	/*@Test(priority=2)// priority
	public void TC_01() 
	{
		
		System.out.println("hi");
		
	}
	@Test(priority=-2)// 
	public void TC_02() 
	{
		
		System.out.println("hi1");
		
	}*/
	//***************************************depends on method*********************************************************************

	/*@Test(dependsOnMethods="TC_02")// priority
	public void TC_01() 
	{
		
		System.out.println("hi");
		
	}
	@Test()
	public void TC_02() 
	{
		
		System.out.println("hi1");
		//Assert.fail(); if u want to fail the test case intentionally
		
	}*/
//***********************************************depends on group******************************************************************	

	/*@Test(groups="smoke")// priority
	public void TC_01() 
	{
		
		System.out.println("one");
		
	}
	
	@Test(groups="smoke")
	public void TC_02() 
	{
		
		System.out.println("two");
	}
	
	@Test(groups="functional",dependsOnGroups="smoke")
	public void TC_03() 
	{
		
		System.out.println("three");
	}
	
	@Test(groups="functional")
	public void TC_04() 
	{
		
		System.out.println("four");
		
		
	}
	@Test(groups="integration",dependsOnGroups="functional")
	public void TC_05() 
	{
		
		System.out.println("five");
		
		
	}
	@Test(groups="integration")
	public void TC_06() 
	{
		
		System.out.println("six");
		
		
	}*/
//****************************************************2************************************************************	
	
	}
	
	













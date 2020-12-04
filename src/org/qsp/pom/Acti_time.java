package org.qsp.pom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_time {

	

	@FindBy(name="username")
	private WebElement username;
	//Find by will indicate that the webelement we are creating (here private WebElement username)
	//is found by that(name="username")
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement keepLoggedIn;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotPassword;
	
	@FindBy(linkText="actiTIME Inc.")
	private WebElement ActTInc;
	
	public Acti_time(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendUsername(String s)
	{
		username.sendKeys("admin");
	}
	
	public void sendpassword(String s)
	{
		username.sendKeys("manager");
	}
	
	public void loginClick()
	{
		loginButton.click();
	}
	
	public void forgetPassword()
	{
		forgotPassword.click();
	}
	
	public void ActTInc()
	{
		ActTInc.click();
	}
	public void forgetRightClick(WebDriver driver)
	{
		Actions a =new Actions(driver);
		a.contextClick(forgotPassword).build().perform();
	}
	
	public void switchTabs(WebDriver driver)
	{
		Set<String>wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
	}
	

	
	
}

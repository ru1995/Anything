package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_time_afterLogin {

	@FindBy(linkText="Logout")
	private WebElement Logout;

	public Acti_time_afterLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void logout()
	{
		Logout.click();
	}
	
	
}

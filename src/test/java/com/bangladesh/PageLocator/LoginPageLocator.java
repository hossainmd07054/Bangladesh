package com.bangladesh.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bangladesh.Util.TestBase_BD;

public class LoginPageLocator extends TestBase_BD{


	public LoginPageLocator() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement Email;

	@FindBy(how=How.ID, using="Password")
	public WebElement Pass;

	@FindBy(how=How.XPATH, using="//button[@id='sign-in-button']")
	public WebElement Login;

	@FindBy(how=How.XPATH, using="//span[text()='MOHAMMAD JAHAN']")
	public WebElement Verifylogin;


}

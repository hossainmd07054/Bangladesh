package com.bangladesh.PageAction;
import org.testng.Assert;

import com.bangladesh.PageLocator.LoginPageLocator;
import com.bangladesh.Util.TestBase_BD;

public class LoginPageAction extends TestBase_BD{

	LoginPageLocator loginPageLocator= new LoginPageLocator();

	public void uercard(String u, String p) {
		loginPageLocator.Email.sendKeys(u);
		loginPageLocator.Pass.sendKeys(p);
		loginPageLocator.Login.click();

	}
	public void Verifyusercanlogin() {
		boolean loginverification = loginPageLocator.Verifylogin.isDisplayed();
		Assert.assertTrue(loginverification);
	}

}

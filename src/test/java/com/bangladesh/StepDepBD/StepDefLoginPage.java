package com.bangladesh.StepDepBD;
import com.bangladesh.PageAction.HomePageAction;
import com.bangladesh.PageAction.LoginPageAction;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.utillll;

import io.cucumber.java.en.Then;

public class StepDefLoginPage extends TestBase_BD{
	
	HomePageAction homePageAction =new HomePageAction();
	LoginPageAction loginPageAction= new LoginPageAction();
	
	@Then("^Click on Signinbutton$")
	public void click_on_Signinbutton() throws Throwable {
		homePageAction.ClickonSigninbutton();
	}
	@Then("^Click signinLink$")
	public void click_signinLink() throws Throwable {
		homePageAction.ClicksigninLink();
	}
	@Then("^Enter user pass and Click signin$")
	public void Enter_user_pass_and_Click_signin() throws Throwable {
		loginPageAction.uercard(prop.getProperty("username1"), prop.getProperty("pass1"));
	}
	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
		loginPageAction.Verifyusercanlogin();
		utillll.takescreenshot(driver, "User Profile Page");
	}
	}

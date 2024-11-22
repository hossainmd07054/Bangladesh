package com.bangladesh.StepDepBD;
import com.bangladesh.PageAction.HomePageAction;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.utillll;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class StepDefHomePage extends TestBase_BD{
	HomePageAction homePageAction =new HomePageAction();

//	@Given("^Open Application \"([^\"]*)\"$")
//	public void open_Application(String URL) throws Throwable {
////		lunchh(URL);
//		driver.get("https://www.dell.com/en-us");
//		utillll.takescreenshot(driver, "Home Page");
//	}
	@Given("Open Application {string}")
	public void open_application(String URL) {
//		HomePageAction homePageAction =new HomePageAction();
		lunchh(URL);
	}

	@Then("^Enter XPS in SearchFiled$")
	public void enter_XPS_in_SearchFiled() throws Throwable {
		homePageAction.EnterXPSinSearchFiled();
	}
	@Then("^Click on SearchLink$")
	public void click_on_SearchLink() throws Throwable {
		homePageAction.ClickonSearchLink();
	}
	@Then("^Verify search result display$")
	public void verify_search_result_display() throws Throwable {
		homePageAction.Verifysearchresultdisplay();
		utillll.takescreenshot(driver, "Search Result Page");
	}
	}


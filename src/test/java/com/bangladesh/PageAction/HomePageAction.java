package com.bangladesh.PageAction;
import org.testng.Assert;

import com.bangladesh.PageLocator.HomePageLocator;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.utillll;

	public class HomePageAction extends TestBase_BD  {
	HomePageLocator homePageLocator = new HomePageLocator();
	public void EnterXPSinSearchFiled() {
	homePageLocator.Searchfield.sendKeys(utillll.laptop);
	}
	public void ClickonSearchLink() {
	homePageLocator.SearchLink.click();
	}
	public void Verifysearchresultdisplay() {
	boolean searchresult =homePageLocator.VerifySearchResult.isDisplayed();
	Assert.assertTrue(searchresult);
	}
	public void ClickonSigninbutton() {
	homePageLocator.Signinbutton.click();
	}
	public void ClicksigninLink() {
	homePageLocator.Signinlink.click();
	}
	}


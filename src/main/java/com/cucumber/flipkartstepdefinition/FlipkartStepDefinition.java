package com.cucumber.flipkartstepdefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.pages.FlipkartMainPage;
import com.cucumber.pages.LoginPageDialog;
import com.cucumber.utils.BrowserPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartStepDefinition extends BrowserPage {
	
	WebDriver driver;
	
	//Properties property;
	//BrowserPage browserPage = new BrowserPage();
	
	WebDriverWait webdriverWait;
	
	FlipkartMainPage flipkartMainPage;
	
	LoginPageDialog loginPageDialog;
	

	/**
	 * flipkart_homepage is used to Open the flipkart home page
	 */
	/**
	 * @throws InterruptedException 
	 * 
	 */
	@Given("^flipkart is already opened$")
	public void flipkart_homepage() throws InterruptedException {
		BrowserPage.initialize();
	}
	
	/**
	 * get_homepage_title is used to get title of homepage
	 * @throws InterruptedException 
	 */
	@When("^title of the page is flipkart$")
	public void get_homepage_title() throws InterruptedException {
		flipkartMainPage = new FlipkartMainPage();
		flipkartMainPage.getHomePageTitle();
//		webdriverWait.wait(10000);
		
	}
	
	/**
	 * click_login_button is used to click on Login details
	 * 
	 */
	@Then("^click on login button$")
	public void click_login_button() {
		flipkartMainPage.clickLoginButton();
	}
	
	/**
	 * enter_user_login_details is used to input the login details
	 */
	@Then("^enter the user login details$")
	public void enter_user_login_details() {
		loginPageDialog = new LoginPageDialog();
		loginPageDialog.sendLoginDetails(property.getProperty("username"), property.getProperty("password"));
	}
	
	@Then("^search the required item$")
	public void search_required_item()   {
//		flipkartMainPage = new FlipkartMainPage();
		flipkartMainPage.searchBoxText(property.getProperty("searchitem"));
	}
	
	@Then("^click on search button$")
	public void search_button_click() throws InterruptedException {
		flipkartMainPage.subitButtonClick();
		TimeUnit.MILLISECONDS.sleep(10000);
	}
	
	@Then("^close on Browser$")
	public void close_browser() {
		flipkartMainPage.closeBrowser();
	}
}

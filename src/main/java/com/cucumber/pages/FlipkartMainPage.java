package com.cucumber.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.utils.BrowserPage;

/**
 * FlipkartMainPage is used to open the flipkart page
 * @author sree
 *
 */
public class FlipkartMainPage extends BrowserPage {
	
	
	@FindBy(xpath = "//input[@name=\"q\"]")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submitButton;
	
	@FindBy(linkText = "Login & Signup")
	WebElement loginButton;
	
	public FlipkartMainPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getHomePageTitle() {
		String homepageTitle = driver.getTitle();
		System.out.println(homepageTitle);
	}
	
	/**
	 * clickLoginButton is used to click the Required Login Button
	 * 
	 */
	public void clickLoginButton() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginButton);
	}
	
	
	
	/**
	 * searchBoxText is used to get Required Search box String
	 * @param searchString
	 * @return null
	 * @throws InterruptedException 
	 */
	public void searchBoxText(String searchString)  {
		driver.get(driver.getCurrentUrl());
		searchBox.sendKeys(searchString);
	}
	
	
	
	/**
	 * submitButtonClick is used to click for searchButton
	 */
	public void subitButtonClick() {
		submitButton.click();
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Executed SucessFully");
	}
}

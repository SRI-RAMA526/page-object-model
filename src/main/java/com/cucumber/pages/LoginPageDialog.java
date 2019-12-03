package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.utils.BrowserPage;

/**
 * LoginPageDialog class is used to Login to the page Sucessfully
 * @author = sree
 */
/**
 * @author sree
 *
 */
public class LoginPageDialog extends BrowserPage {

	@FindBy(xpath = "//input[@type=\"text\" and @class=\"_2zrpKA _1dBPDZ\"]")
	WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement passwordValue;
	
	@FindBy(xpath = "//button[@type=\"submit\" and @class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	WebElement loginButton;
	
	public LoginPageDialog() {
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * sendLoginDetails is used to get username & password from main page
	 * @param userName
	 * @param passwordText
	 */
	public void sendLoginDetails(String userName,String passwordText) {
		mobileNumber.sendKeys(userName);
		passwordValue.sendKeys(passwordText);
		loginButton.click();
	}
}

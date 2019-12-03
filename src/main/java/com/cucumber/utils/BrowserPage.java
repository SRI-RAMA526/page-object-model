package com.cucumber.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPage {
	
	public static WebDriver driver;
	
	public static Properties property;
	
	public BrowserPage()  {
		try {
			property = new Properties();
			FileInputStream fisValue = new FileInputStream("E:\\Cucumber Practice\\loginpages\\src\\main\\java\\com\\cucumber\\config\\config.properties");
			property.load(fisValue);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	public static void initialize() {
		
		String browserName = property.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium zip\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtil.PAGE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.get(property.getProperty("url"));
	}
	

}

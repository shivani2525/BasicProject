package com.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver;
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
	            "F:\\basic Practice\\SeleniumTest2\\chromedriver.exe");		

	 driver = new ChromeDriver();	

	}
	
	public static void clickElement(WebElement we) {
		we.click();
	}
	
	public static void enterText(WebElement we,String value) {
		we.sendKeys(value);
	}
	

}

package com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BasePage.BasePage;

public class PracticeForm extends BasePage{
	
	

//	@FindBy(xpath = "//a[@class='account_icon']")
	
		//methods
	public void clickOnMyAccount() {
		WebElement linkMyAccount = driver.findElement(By.xpath("//a[@class='account_icon']"));
		
	
		clickElement(linkMyAccount);
		
		
	}
	
	
	

}

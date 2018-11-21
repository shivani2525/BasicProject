package TestClasses;

import org.testng.annotations.Test;

import com.BasePage.BasePage;
import com.PageObject.PracticeForm;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SelectCheckBoxTest {
	PracticeForm ptF = new PracticeForm();
	
  @Test
  public void testForClickOnMyAccount() throws InterruptedException {
	 
	  Thread.sleep(5000);
	System.out.println("Test");  
	ptF.clickOnMyAccount();
//	Assert.assert
	Thread.sleep(5000);
	
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod");  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");  
	  BasePage.driver.get("http://store.demoqa.com/");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite"); 
	  BasePage.setup();   //webdriver initialization
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuit");
	  BasePage.driver.close();
  }

}

package TestClasses;

import org.testng.annotations.Test;

import com.BasePage.BasePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SelectCheckBoxTest2 {
  @Test
  public void f() {
	  
	System.out.println("Test2");  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod2");  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod2");  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass2");  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass2");  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest2");  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest2");  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite2");  
	  BasePage.setup();   //webdriver initialization
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuit2");  
  }

}

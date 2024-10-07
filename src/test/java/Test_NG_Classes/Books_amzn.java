package Test_NG_Classes;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AmazonPage.BooksPage;
import AmazonPage.HomePage;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Books_amzn extends UTILITIES.Utilities {
	
	
  @Test(priority = 1)
  public void test1() {
	  
	 
	  
	  
	  HomePage hmpg= new HomePage(driver);
	  waitforpagetitle("Amazon.com. Spend less. Smile more.");
	  
	  hmpg.booksbtnclick();
	  
	  String Actualtitlebookspage=driver.getTitle();
	  log.info("found the title");
	  String Expectedtitlebookspage= "Amazon.com:Books";
	  
	  SoftAssert gh= new SoftAssert();
	  
	  //gh.assertEquals(Actualtitlebookspage,Expectedtitlebookspage,"verify the page title is-'Amazon.com: Books'");
	  
	  log.info("work in progress");
	  
	  gh.assertTrue(Actualtitlebookspage.equalsIgnoreCase("Amazon.com: Books"), "Verify the book's page title.");
	  
	  log.info("The test is completed");
	  
	  
	  
	  System.out.println("test with valid cred");
	  
	  System.out.println("clicked on sign-up button");
	  
	  gh.assertAll();
  }
  

  
  
  
  
  
  
  
  
	
  @Test (priority=2)
  public void test2() {
	  System.out.println("this is test 2");
	 
  }

  

}

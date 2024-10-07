package Test_NG_Classes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import UTILITIES.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logtestclass2 extends Utilities{
  @Test
  public void verify_homepage() throws InterruptedException {
	  test= reports.createTest("verify_homepage").assignAuthor("Israt").assignCategory("sanity").assignDevice("Mac");
	
	  
	  String Expected_Title="Google1";
	  
	  log.info("Getting Actual title");
	  String Actual_Title=driver.getTitle();
	  log.info("Collected title");
	  
	  
	  if(Actual_Title.equals(Expected_Title)) {
		  log.info("title verified and matched with expected title");
		  test.pass("verify_homepage");
		  
	  }
	  
	  else {	
		  log.error("Title verification Failed, Title expected:" +Expected_Title+"but found:"+ Actual_Title);
		 //test.fail("verify_homepage");
		  test.log(Status.FAIL,MarkupHelper.createLabel("verify_homepage", ExtentColor.RED) );
		  test.addScreenCaptureFromPath(CaptureSSforER("er_ss"), "Failed to verify Title");
		  
	  }
	  
	  
	 
	  
	  
  }
}


package Test_NG_Classes;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import UTILITIES.Utilities;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EX_TEST extends Utilities {
	
	  //ExtentReports extent = new ExtentReports(); //reports
	  //ExtentSparkReporter spark = new ExtentSparkReporter("RESULTS/Sadia_"+ System.currentTimeMillis()+ ".html");//htmlreporters
      //ExtentTest test;
	  
	  
  @Test
  public void TC1_verify_homepage() {
	  test= reports.createTest("LaunchBrowser and go to Website").assignAuthor("Israt").assignCategory("smoke").assignDevice("chrome");
	  //browser initialized
	  //implicit wait given
	  //maximize screen 
	  //go to URL
	  //verify homepage title
	  
	//test.log(Status.PASS, "user launched the website successfully");
	  test.pass("user successfully land on Homepage and title verified");
	
	  
	  
	  
	  
  }
  @Test
  public void TC2_validate_login() {
	  test= reports.createTest("Validate Login").assignAuthor("Tahsin").assignCategory("smoke").assignDevice("chrome");
	  //type email and password in login field
	  //click on login button
	  //wait for the alert
	  test.warning("alert displaying");
	  //accept the alert
	  //verified homepage after logging in successfully
	  test.pass("user logged in to the applications successfully");
		
  }
  @Test
  public void TC3() {
	  test= reports.createTest("Validate dashboard").assignAuthor("Samira").assignCategory("smoke").assignDevice("chrome");
	  //click on dashboard
	  //verify/assert the title
	  test.fail("title is not verified ");
	  //accept the alert
	  //verified homepage after logging successfully
	  test.skip("test skipped");
  }
  
  @Test
  public void TC4_verify_email_field() {
	  test= reports.createTest("validate emailfield").assignAuthor("Suzy").assignCategory("smoke").assignDevice("chrome");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  reports.attachReporter(htmlReporter);

  }

  @AfterTest
  public void afterTest() {
	  reports.flush();
  }

}

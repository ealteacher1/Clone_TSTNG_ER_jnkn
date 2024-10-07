package Test_NG_Classes;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EX_TEST {
	
	  ExtentReports extent = new ExtentReports(); //reports
	  ExtentSparkReporter spark = new ExtentSparkReporter("RESULTS/Sadia_"+ System.currentTimeMillis()+ ".html");//htmlreporters
      ExtentTest test;
	  
	  
  @Test
  public void TC1_verify_homepage() {
	  test= extent.createTest("LaunchBrowser and go to Website").assignAuthor("Israt").assignCategory("smoke").assignDevice("chrome");
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
	  test= extent.createTest("Validate Login").assignAuthor("Tahsin").assignCategory("smoke").assignDevice("chrome");
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
	  test= extent.createTest("Validate dashboard").assignAuthor("Samira").assignCategory("smoke").assignDevice("chrome");
	  //click on dashboard
	  //verify/assert the title
	  test.fail("title is not verified ");
	  //accept the alert
	  //verified homepage after logging successfully
	  test.skip("test skipped");
  }
  
  @Test
  public void TC4_verify_email_field() {
	  test= extent.createTest("validate emailfield").assignAuthor("Suzy").assignCategory("smoke").assignDevice("chrome");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  extent.attachReporter(spark);

  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
  }

}

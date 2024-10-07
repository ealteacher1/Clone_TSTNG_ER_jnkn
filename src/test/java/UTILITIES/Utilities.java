package UTILITIES;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities extends Common{
 	

public Logger log=(Logger) LogManager.getLogger(Utilities.class);



    @BeforeTest
    public void beforetest() {
    	log.info("beforetest method");
   
    	
    	
    	
    }
    
    @AfterTest
    public void aftertest() {
    	log.info("aftertest method");
    	 
    }


	  
      @Parameters({"browser", "websiteurl"})
	  @BeforeClass
	  public void beforeClass(String browsername, String URL) throws InterruptedException  {
		 
		  Ibrowser(browsername,URL );
		  log.info("User is on the Homepage");
		  	 
		 
	  }
	    

	  @AfterClass
	  public void afterClass() throws InterruptedException {
		 Thread.sleep(2000);
		 log.info("browser is closing");
		 tearDown();
	  }
	  
	
		 
		    }


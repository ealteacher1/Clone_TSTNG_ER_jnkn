package Test_NG_Classes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import UTILITIES.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import sm.Clone_TSTNG_ER_jnkn.BrowserLaunch;

public class LogTestClass {
	public WebDriver driver;
	
	Logger log=LogManager.getLogger(BrowserLaunch.class);
	
	

  @Test
  public void f() {WebDriverManager.chromedriver().setup();

	
	driver= new ChromeDriver(); 
	log.info("driver launched");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	log.info("Window maximized");
	
	driver.get("https://www.myntra.com");
	log.info("user land on to the website");
	
	
	try {
		log.info("clicking on women button");
	driver.findElement(By.linkText("Women")).isDisplayed();
	driver.findElement(By.linkText("Women")).click();
	log.info("Women button is clicked");
	}
	
	catch (Exception e) {
	
	
		log.error("exception occurred", new Exception("element not found"));
	}
	
	
	finally {
		driver.quit();
		log.info("Quitting the driver");
	}
	
	
	
	
	

}

}

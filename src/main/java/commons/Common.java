package commons;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
	
            
	public WebDriver driver;
    public String ud=System.getProperty("user.dir");
    public Logger log=(Logger) LogManager.getLogger(Common.class);

	 
		
		  
		  

			
			public  void waitforelementclickable (WebElement elementvariable) {
			
				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				   wait.until(ExpectedConditions.elementToBeClickable(elementvariable));
					log.info("waiting for element to be clickable");
			}
			
			
			public  void waitforpagetitle (String pagetitle) {
		
				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				   wait.until(ExpectedConditions.titleContains(pagetitle));
				   log.info("waiting for pagetitle");
			}
			

			public void switchtoopenwindow(String parent,WebDriver driver) {
				Set<String> wins=driver.getWindowHandles();
				for (String sesid:wins) {
					if (sesid!= parent) {
						driver.switchTo().window(sesid);
			log.info("window switched-Driver is present in the new window/tab");
					}
				}
			}
			
			public void Screenshots(String foldername) {
				
				
				File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File destinationpath= new File(ud+"\\Pictures\\"+foldername+"\\home"+System.currentTimeMillis()+".jpg");
				try {
					FileHandler.copy(ss,destinationpath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			 public void closebrowser() {
				   driver.close();
			   }
			 
			 public  void Ibrowser(String BrowserName, String URL) throws InterruptedException {
				  
					if (BrowserName.equalsIgnoreCase("Chrome")) {
						WebDriverManager.chromedriver().setup();
						
						 driver= new ChromeDriver();
						 driver.get(URL);
						
						 driver.manage().window().maximize();
						 Thread.sleep(3000);
						
					}
						
					else if (BrowserName.equalsIgnoreCase("Edge")) {
						WebDriverManager.edgedriver().setup();

						 driver= new EdgeDriver();
						 driver.get(URL);
						 
						 driver.manage().window().maximize();
						 
						 Thread.sleep(3000);
					}
					}
			  
			
			
			
		  
		  
		  
		  
		  
		  
		  
		   
		   }
			
			

		
		
		
		
		
		
		
		






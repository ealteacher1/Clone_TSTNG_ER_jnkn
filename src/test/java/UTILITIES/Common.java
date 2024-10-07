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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.train.org.TestNG_L4J_ER.BrowserLaunch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
	
   
	public WebDriver driver;
	public String ud=System.getProperty("user.dir");
	public Logger log=(Logger) LogManager.getLogger(Common.class);
	
	
    public ExtentReports reports = new ExtentReports(); //reports
    //public ExtentSparkReporter htmlReporter = new ExtentSparkReporter("RESULTS/Jenkins_ContentReport"+ System.currentTimeMillis()+ ".html");//htmlreporters
    
    public ExtentSparkReporter htmlReporter=new ExtentSparkReporter("RESULTS/Jenkins_ExtentReport.html");
    public ExtentTest test;
		  

			
			public  void waitforelementclickable (WebElement elementvariable) {
				log.info("waiting for element to be clickable");
				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				   wait.until(ExpectedConditions.elementToBeClickable(elementvariable));
			}
			
			
			public  void waitforpagetitle (String pagetitle) {
				log.info("waiting for epagetitle");
				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				   wait.until(ExpectedConditions.titleContains(pagetitle));
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
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					log.info("screenshot taken");
					}
				}
				
				
				/*
				 * public String CaptureSSforER (String foldername) {
				 * 
				 * 
				 * File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File
				 * destinationpath= new
				 * File(ud+"\\Pictures\\"+foldername+"\\home"+System.currentTimeMillis()+".jpg")
				 * ; try { FileHandler.copy(ss,destinationpath); } catch (IOException e) { //
				 * TODO Auto-generated catch block e.printStackTrace();
				 * log.info("screenshot not taken"); }
				 * 
				 * 
				 * String absolutePath=destinationpath.getAbsolutePath(); return absolutePath; }
				 */
              
          	
              public String CaptureSSforER (String foldername) {
				
            	File destinationpath= new File(ud+"\\Pictures\\"+foldername+"\\home"+System.currentTimeMillis()+".jpg");
            	
            	try {
				
            		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
					FileHandler.copy(ss,destinationpath);
				} 
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					log.info("screenshot not taken");
					}
				
              
              String absolutePath=destinationpath.getAbsolutePath();
              return absolutePath;
              }
              
              
              
         	 public  void Ibrowser(String BrowserName, String URL) throws InterruptedException  {
    			 
 				if (BrowserName.equalsIgnoreCase("Chrome")) {
 					WebDriverManager.chromedriver().setup();
 					
 					 driver= new ChromeDriver();
 					 driver.get(URL);
 					 log.info("ChromeDriver initialized");
 					 driver.manage().window().maximize();
 					 Thread.sleep(3000);
 					
 				}
 					
 				else if (BrowserName.equalsIgnoreCase("Edge")) {
 					WebDriverManager.edgedriver().setup();

 					 driver= new EdgeDriver();
 					 driver.get(URL);
 					 log.info("EdgeDriver initialized");
 					 driver.manage().window().maximize();
 					 
 					 Thread.sleep(3000);
 				}
         	 }
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			 public void tearDown() {
				   driver.close();
				   log.info("browser is closing");
				   
			   }
			 

			 public void configurereport() {
				 
				 //Attach Reporter
				 reports.attachReporter(htmlReporter);
				 
				 //Add system information/Environment information to Report
				 
				 reports.setSystemInfo("Machine", "Testpc1");
				 reports.setSystemInfo("OS", "Windows11");
				 reports.setSystemInfo("browser", "chrome");
				 reports.setSystemInfo("User name", "ISRAT");
				 
				 //Configuration to change the appearance or layout of the report
				 htmlReporter.config().setTheme(Theme.DARK);
				 htmlReporter.config().setReportName("Myntra Testreport");
			    htmlReporter.config().setDocumentTitle("SADIA'S REPORT");
				 
				 
				 
			 }
			
				
					
					
					
					}
			  
			
			
			
		  
		  
		  
		  
		  
		  
		  
		   
		   
			
			

		
		
		
		
		
		
		
		






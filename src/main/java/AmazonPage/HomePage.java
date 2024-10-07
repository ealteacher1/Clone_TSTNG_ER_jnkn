package AmazonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Common;

public class HomePage extends Common {
	
	WebDriver driver;
	
	@FindBy(linkText = "Books")WebElement booksbtn;
	@FindBy(linkText = "Customer Service") WebElement cstmrsrvcbtn;
	
	//Action method for each element
	
	public void booksbtnclick() {
		booksbtn.click();	
		log.info("booksbtn clicked");
	}
	
	public void cstmrclick() {
		waitforelementclickable(cstmrsrvcbtn);
		cstmrsrvcbtn.click();
		log.info("cstmrbtn clicked");
	}
	
	public HomePage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}

package AmazonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Common;


public class BooksPage {
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Kindle eBooks']")WebElement kindleEboks;
	
	
	public void kindleEbooksClick () {
		waitforelementclickable(kindleEboks);
		kindleEboks.click();
	}
	
	
	
	
	
	
	
	
	
	
	
private void waitforelementclickable(WebElement kindleEboks2) {
		// TODO Auto-generated method stub
		
	}











public BooksPage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


}

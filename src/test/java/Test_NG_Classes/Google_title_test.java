package Test_NG_Classes;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import UTILITIES.Utilities;

public class Google_title_test extends Utilities {
  @Test
  public void land_onto_the_website () {
	  String Expected_Title="Google1";
	  log.info("Capturing page title");
	  String Actual_Title=driver.getTitle();
	  SoftAssert ast=new SoftAssert();
	  ast.assertEquals(Actual_Title, Expected_Title, "Title should mismatch and test fails");
	  ast.assertAll();
  } 
  
  @Test
  public void click_on_about_button () {
	  
	  
	  try {
		  driver.findElement(By.linkText("About"));
	  }
	  catch (Exception e) {
		log.info("test failed");
	}
  }
}

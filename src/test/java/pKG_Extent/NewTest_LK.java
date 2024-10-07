package pKG_Extent;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest_LK {
 
  @BeforeTest
  public void Btest() {
	  System.out.println("beforetest");
	  Assert.assertTrue(true);
	  
	  
  } 

  @AfterTest
  public void Atest() {
	  System.out.println("aftertest");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void Test1_validate_login() {
	  System.out.println("test1");
	  Assert.assertTrue(true);
  }
  
  
  
  @Test
  public void Test2_validate_reg_button() {
	  System.out.println("test2");
	  Assert.assertTrue(false);
  }

  
  
  
  @Test
  public void Test3() {
	  System.out.println("test3");
	  Assert.assertTrue(false);
  }

  
  
  @Test
  public void Test4() {
	  System.out.println("test4");
	  Assert.assertTrue(true);
  }

  
  
  
  @Test
  public void Test5() {
	  System.out.println("test5");
	  Assert.assertTrue(false);
  }


}

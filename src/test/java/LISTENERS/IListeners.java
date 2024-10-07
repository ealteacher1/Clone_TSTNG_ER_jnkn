package LISTENERS;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import UTILITIES.Common;
import UTILITIES.Utilities;


public class IListeners extends Utilities implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver=((Common)result.getInstance()).driver;
		//this.driver=((Utilities)result.getInstance()).driver;
		
		log.info("Test Passed");
		
		
			Screenshots("Passed");
		
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver=((Common)result.getInstance()).driver;
		//this.driver=((Utilities)result.getInstance()).driver;
		
		
		
		log.info("Test failed");
		
			Screenshots("Failed");
		
		
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		this.driver=((Utilities)result.getInstance()).driver;
	
	}

}

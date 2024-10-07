package LISTENERS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import UTILITIES.Common;
import UTILITIES.Utilities;


public class TestListeners extends Utilities implements ITestListener{
	
	
	@Override
	public void onStart(ITestContext context) {
		configurereport(); 
		
		log.info("On-start Listeners, Extent Report Configuration done");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
	 	reports.flush();
	 	log.info("On-Finish Listeners, Extent Report Configuration done");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		log.info("on test-start, Now executing: " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
    	this.driver=((Utilities)result.getInstance()).driver;
		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("name of the passed method" + result.getName(), ExtentColor.GREEN));
		
		test.addScreenCaptureFromPath(CaptureSSforER("er_ss"));
	}

	@Override
	public void onTestFailure(ITestResult result) {
//		this.driver=((Utilities)result.getInstance()).driver;
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("name of the failed method" + result.getName(), ExtentColor.RED));
		
		test.addScreenCaptureFromPath(CaptureSSforER("er_ss"));
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("name of the skipped method" + result.getName(), ExtentColor.ORANGE));
		
	}



}

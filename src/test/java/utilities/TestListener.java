package utilities;


import java.io.File; 
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testscript.BaseClass;



public class TestListener extends BaseClass implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
		
	}

	public void onTestFailure(ITestResult result) {
	
		 String testName = result.getMethod().getMethodName();
	        System.out.println("*****Test is failed, screenshot captured******* : " + testName);

	        Date currentDate = new Date();
	        String fileName = currentDate.toString().replace("new", "my3d").replace(":","-");
	      
	      // String fileName = currentDate.toString().replace(" ", "-").replace(":","-");
	        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(file, new File ("C:\\Users\\Dell\\git\\WEBFRAME_WORK\\FrameWork\\ss\\"+fileName+"\\hrm.png"));
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
			System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");

	        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
	    }
		
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}


}

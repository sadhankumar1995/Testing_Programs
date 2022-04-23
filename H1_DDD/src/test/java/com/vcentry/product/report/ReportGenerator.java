package com.vcentry.product.report;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.product.intilializer.Initializer;

public class ReportGenerator extends Initializer {

	public static void generateReport(ITestResult it) throws IOException
	{
		Object[] data=it.getParameters();
		
		if(it.isSuccess())
	   	 {
	   	 String path=takeScreenshot(data[0].toString());
	   	 
	   	 log.log(LogStatus.PASS, "testcase pass", log.addScreenCapture(path));
	   	 }else 
	   	{
	       	 String path=takeScreenshot(data[0].toString());
	       	 log.log(LogStatus.FAIL, "testcase failed", log.addScreenCapture(path));
	         }
	   	 reports.endTest(log);
	   	 reports.flush();
	}
	public static String takeScreenshot(String name) throws IOException{
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Batch213\\G1_DDD\\ScreenShot\\"+name+".png");
		
		
		FileHandler.copy(src, dst);
		return dst.toString();	
	}
	
	
	
	
	
}

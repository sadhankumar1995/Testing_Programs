package com.vcentry.product.intilializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.product.utils.ReportArchiver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {

	
	public static Properties envprop=null;
	public static Properties locatorprop=null;
	public static WebDriver wd=null;
	public static ExtentReports reports;
	public static ExtentTest log;
	public static boolean isReportExist=false;
	public static void initialize() throws IOException
	{
		if(!isReportExist)
		{
		reports= new ExtentReports("C:\\Batch213\\G1_DDD\\Reports\\Sample.html");
		ReportArchiver.archiveScreenshot();
		isReportExist=true;
		}
		//File f= new File("C:\\Batch213\\G1_DDD\\src\\test\\resources\\com\\vcentry\\product\\config\\env.properties");
		
		//File f= new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"product"+File.separator+"config"+File.separator+"env.properties");
		//FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"product"+File.separator+"config"+File.separator+"env.properties"));
		envprop= new Properties();               
		envprop.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"product"+File.separator+"config"+File.separator+"env.properties")));
		
		locatorprop= new Properties();               
		locatorprop.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"product"+File.separator+"config"+File.separator+"locator.properties")));
		
		
		if(envprop.get("BROWSER").equals("CHROME"))
		{
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		}
		else if(envprop.get("BROWSER").equals("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			wd= new FirefoxDriver();
		}
		else if(envprop.get("BROWSER").equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			wd= new InternetExplorerDriver();
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public static WebElement elementByName(String locatorProp)
	{
	return	wd.findElement(By.name(locatorprop.getProperty(locatorProp)));
	}
	
	public static WebElement elementById(String locatorProp)
	{
		return	wd.findElement(By.id(locatorprop.getProperty(locatorProp)));
	}
	
	
	
	
	
}

package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

		public static WebDriver driver;
		public static Properties prop;
		public static Logger logger;
		public static ExtentReports extent;
		public static ExtentSparkReporter reporter;
		public static String reportPath;
		
		
		public Base()
		{
			try {
				prop=new Properties();
				FileInputStream fis=new FileInputStream(".\\src\\main\\java\\com\\config\\config.properties");
				prop.load(fis);
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found "+e.getLocalizedMessage());
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException "+e.getLocalizedMessage());
			}
		}
		@BeforeClass
		public void initializaiton()
		{
			logger=Logger.getLogger(Base.class);
			String browser=prop.getProperty("Browser");
			String url=prop.getProperty("url");
			if(browser.equals("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.get("https://www.bigbasket.com/");
			logger.info("Application Launched succefully");
		}
		
		/*Actions action;
		public void performMouseHower(WebElement element,WebDriver driver) {
			action=new Actions(driver);
			action.moveToElement(element).build().perform();
		}
		
		public void click(WebElement element) {
			element.click();
		}
		public void clear(WebElement element) {
			element.clear();
		}
		public void setText(String text,WebElement element) {
			element.sendKeys(text);
		}
		public void selectByVisibleText(WebElement selectSize,String text) {
			Select s=new Select(selectSize);
			s.selectByVisibleText(text);
		}
		public void  clickUsingJavaScriptExecutor(WebElement element,WebDriver driver) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript(reportPath, element);
		}
		public void refresh() {
			driver.navigate().refresh();
		}
		public boolean validateText(WebDriver driver,WebElement element,String expectedText) {
			String observedText=element.getText();
			System.out.println(observedText);
			if(observedText.equals(expectedText)) {
				return true;
			}
			return false;
		}*/
		
		
		
		public void extentReportSetup()
		{
			reportPath=System.getProperty("user.dir")+"/ExtentReport/index.html";
			reporter=new ExtentSparkReporter(reportPath);
			reporter.config().setDocumentTitle("TDD Framework Automation");
			reporter.config().setReportName("BigBasket Automation");
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
			logger.info("Browser closed successfully");
		}
		
		public void closeExtentReportSetup()
		{
			extent.flush();
		}
		
	}


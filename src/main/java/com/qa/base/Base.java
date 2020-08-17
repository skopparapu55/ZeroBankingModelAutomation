package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;

import com.qa.datadriven.DataDriven;

public class Base {
	public  static WebDriver driver;
	public  static Properties pro;
	
public static Logger log=LogManager.getLogger(Base.class);
	
	public static void initi() throws IOException
	{
		pro =new Properties();
		String FilePath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties";
		FileInputStream fis = new FileInputStream(FilePath);
		pro.load(fis);
		String b = pro.getProperty("broswer");
		if(b.equalsIgnoreCase("chrome"))
		{
			String path = System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
			}
		 if(b.equalsIgnoreCase("FireFox"))
		{
			String path = System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver-v0.26.0-win64\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		}
		else if(b.equalsIgnoreCase("ie"))
		{
			String path = System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", path);
			driver = new InternetExplorerDriver();
		}
		driver.get(pro.getProperty("url"));
		log.debug("hit the url");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	public  static void CaptureScreen(String s) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String fp = System.getProperty("user.dir")+"\\ScreenShots\\"+s+".png";
		File dest = new File(fp);
		FileUtils.copyFile(src, dest);
		
}
	@DataProvider
	public Object[][] getData() throws IOException
	{
	Object obj[][]= new Object[2][2];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			obj[i][j]=DataDriven.FetchDataFromExcel("Login1", i, j);
		}
		
	}
	return obj;
	}
	public  void closebrowser() 
	{
		driver.quit();
	}



}

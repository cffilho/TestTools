package br.co.figueira;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriveFactory {
	
	private static WebDriver driver;
	
	private DriveFactory() {
		
	}
	
	public static WebDriver getDriver() {
		if(driver == null)
		{
			switch(Properties.browser) {
			
			case FIREFOX: 
			System.setProperty("webdriver.gecko.driver", "\\Users\\Figueira\\Documents\\Drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
			case CHROME:
			System.setProperty("webdriver.chrome.driver", "\\Users\\Figueira\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
				
			}
			
		}
		
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) 
		{
			driver.quit();
			driver = null;
		}
	}
	
}

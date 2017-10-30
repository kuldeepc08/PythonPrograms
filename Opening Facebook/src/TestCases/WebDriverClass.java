package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverClass {
	
	static WebDriverClass objWebDriverClass;
	static WebDriver driver;

		public static WebDriverClass getInstance()
		{
			if (objWebDriverClass==null)
			{
				objWebDriverClass = new WebDriverClass();
			}
			return objWebDriverClass;
		}
	public WebDriver getWebDriver()
	{
		
		if (driver==null)
		{
			 driver =new ChromeDriver();
			//driver=new FirefoxDriver();
		}
		return driver;
		
	}
	public WebDriver getWebFireFoxDriver()
	{
		
		if (driver==null)
		{
			 driver =new FirefoxDriver();
			//driver=new FirefoxDriver();
		}
		return driver;
		
	}
}

package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.Registration;
import TextData.ReadExcelData;

public class OpenBrower {
	Registration obj;
	ReadExcelData objReadExcelData;
	
	 public OpenBrower()
	 { 
		 obj = new Registration();
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\IE and Chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		 
	 }
	
	@BeforeSuite
	public void setUp() throws InterruptedException
	{
		//driver = new FirefoxDriver();
		
		WebDriverClass.getInstance().getWebDriver().manage().window().maximize();
		WebDriverClass.getInstance().getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverClass.getInstance().getWebDriver().get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		WebDriverClass.getInstance().getWebDriver().manage().window().maximize();
		WebDriverClass.getInstance().getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverClass.getInstance().getWebFireFoxDriver().get("https://www.facebook.com/");
				
	}
	@Test(priority=0)
	public void testLogin()
	{
		//obj.clickOnLogin().click();
		obj.sendUserName("kuldeepc08@gmail.com");
		obj.sendUserPassword("Test123$$");
		obj.clickSignInButton().click();
		
		/*driver.findElement(By.cssSelector("label#menu_login_show_link")).click();
		driver.findElement(By.name("email")).sendKeys("kuldeepc08@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Test123$$");
		driver.findElement(By.cssSelector("input[type='submit']")).click();*/
	}
	
	public void getCellData()
	{
		String userName = objReadExcelData.getCellData(1, 1) ;
		String password = objReadExcelData.getCellData(1, 2);
	}
	

}

package multiBrowsers;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunMultiBrowsers {
	public static RemoteWebDriver driver;
	 String baseUrl = "http://138.197.85.124/portal/474#/loginHome";
	 
	 public static final String USERNAME = "kuldeepc";
	 public static final String ACCESS_KEY = "5ed7d69f-b0e6-4ae4-b075-bee415ba75ed";
	 public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

     /*@Parameters({"browser"})*/
	
     public static void main(String []args) throws Exception{
		 
		  DesiredCapabilities caps = DesiredCapabilities.chrome();
		   caps.setCapability("platform", "Windows XP");
		   caps.setCapability("version", "43.0");

		    driver = new RemoteWebDriver(new URL(URL), caps);

		   /**
		    * Goes to Sauce Lab's guinea-pig page and prints title
		    */

		   driver.get("http://138.197.85.124/portal/474");
	
	 /*try{
           
         //Check if parameter passed from TestNG is 'firefox'

         if(browser.equalsIgnoreCase("firefox")){

         //create firefox instance

             driver = new FirefoxDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

         }

         //Check if parameter passed as 'chrome'

         else if(browser.equalsIgnoreCase("chrome")){

             //set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver

             System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\IE and Chrome\\chromedriver_win32\\chromedriver.exe");

             //create chrome instance

             driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

         }

             else if(browser.equalsIgnoreCase("ie")){

             //set path to IEdriver.exe You may need to download it from

      // 32 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip

      // 64 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip

             System.setProperty("webdriver.ie.driver","E:\\Selenium Jars\\IE and Chrome\\IEDriverServer.exe");

             //create chrome instance

             driver = new InternetExplorerDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         }

         else{

             //If no browser passed throw exception

             throw new Exception("Browser is not correct");

         }
	 }
	 catch (WebDriverException e) {
			System.out.println(e.getMessage()); 
		 
	 }

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*/     
		 }
	 /*@Test(priority=-9)
	 public void login_TestCase()
	 {
			driver.navigate().to(baseUrl);
	                //do something
	 }*/
	 @Test(priority=-8)
	 public void testClickOnStartNowButton() throws InterruptedException
	 {
		 WebElement element = driver.findElement
				 (By.cssSelector(".startNowBtn.customSmallButton.fontSize18.startNowButtonGradient"));
		 
	 
		 if (driver.findElements(By.cssSelector(".startNowBtn.customSmallButton.fontSize18.startNowButtonGradient")).size()>=0)
		 {
		 element.click();
		 Thread.sleep(10000);
		 }
		 else
		 {
			 System.out.println("No cookie button is found");
		 }
		
	 }
	 @Test(priority=-7)
	 public void testVerifyLoginLink()
	 {
		 String actual = driver.getCurrentUrl();
		 String expected = "http://138.197.85.124/private-access-openid-server/login";
		 Assert.assertEquals(actual, expected);
		 Alert alert = null;
		 alert.accept();
	 }
}

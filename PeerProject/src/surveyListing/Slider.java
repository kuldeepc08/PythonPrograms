package surveyListing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class Slider {

	   @Test(priority=-10)
	public void testVerifyQuestionNameFromSecondSlide() throws InterruptedException
	{
	     WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
			Thread.sleep(5000);
		String actual  = RunMultiBrowsers.driver.findElement(By.cssSelector("h1.newhead")).getText();
		String expected = KC_EnumeratedClass.Question5;
		Assert.assertEquals(actual, expected);
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	   @Test(priority=-9)
	public void testMoveSlider() throws InterruptedException
	{
		   WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
			RunMultiBrowsers.driver.switchTo().frame(fr);
			
		WebElement slider = RunMultiBrowsers.driver.findElement
		               (By.xpath("//span[@tabindex='0']"));
		 
		 Actions action = new Actions(RunMultiBrowsers.driver);
		 
		 action.click(slider).build().perform();
		 Thread.sleep(1000);
		 for (int i = 0; i < 150; i++) {
		     action.sendKeys(Keys.ARROW_RIGHT).build().perform();
		     Thread.sleep(200);
		 }
		 
			RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	   @Test(priority=-8)
	   public void testClickOnMoreLink()
	   {
		   WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
			RunMultiBrowsers.driver.switchTo().frame(fr);
			
		   WebElement moreLink = RunMultiBrowsers.driver.findElement
	               (By.cssSelector("a.themeinfoclass"));
		   moreLink.click();
			RunMultiBrowsers.driver.switchTo().defaultContent();
	   }
	   
	   @Test(priority=-6)
	   public void testClickOnNext() throws InterruptedException
	   {
		   WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
			RunMultiBrowsers.driver.switchTo().frame(fr);
			
		   RunMultiBrowsers.driver.findElement(By.cssSelector(".save.btn-tran-save")).click();
		   Thread.sleep(5000);
			RunMultiBrowsers.driver.switchTo().defaultContent();
	   }

}

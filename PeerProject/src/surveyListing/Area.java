package surveyListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class Area {

	@Test(priority=-10)
	public void testVerifyQuestionName()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		String actual = RunMultiBrowsers.driver.findElement(By.cssSelector("h1.newhead")).getText();
		String expected = KC_EnumeratedClass.Question2;
		Assert.assertEquals(actual, expected);
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-9)
	public void testSendValuesToTextBoxes() throws InterruptedException
	{
	WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement elem1 = RunMultiBrowsers.driver.findElement
		                   (By.cssSelector(".leftVal_question_12505.areabox"));
		elem1.sendKeys(KC_EnumeratedClass.TextBox1);
		
		WebElement elem2 = RunMultiBrowsers.driver.findElement
                (By.cssSelector(".rightVal_question_12505.areabox"));
        elem2.sendKeys(KC_EnumeratedClass.TextBox2);
    	RunMultiBrowsers.driver.switchTo().defaultContent();
    	Thread.sleep(10000);
	}
	@Test(priority=-8)
	public void testDropDownBox() throws InterruptedException
	{
        WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
				             (By.cssSelector(".question_12505_measure.themeselectclass"));
		Select drop = new Select(element);
		drop.selectByValue("1");
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(10000);
	}
	@Test(priority=-7)
	public void testMoreLink() throws InterruptedException
	{
         WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element  = RunMultiBrowsers.driver.findElement(By.cssSelector(".themeinfoclass"));
		element.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
	@Test(priority=-6)
	public void testClickOnNextButton() throws InterruptedException
	{
		 WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
			
			RunMultiBrowsers.driver.switchTo().frame(fr);
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector(".save.btn-tran-save"));
		element.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
}

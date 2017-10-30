package surveyListing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class SurveyStarted {
	
	@Test(priority=-10)
	public void testVerifyImageIsPresent() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		Thread.sleep(5000);
		
		boolean element = RunMultiBrowsers.driver.findElement
				          (By.cssSelector("img.img-responsive")).isDisplayed();
		
		System.out.println("Question Image is present - " +element);
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-9)
	public void testVerifyQuestionNameFromFirstSlide()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		String actual = RunMultiBrowsers.driver.findElement(By.cssSelector("h1.newhead")).getText();
		String expected = KC_EnumeratedClass.QuestionName;
		Assert.assertEquals(actual, expected);
		
		JavascriptExecutor jse = (JavascriptExecutor)RunMultiBrowsers.driver;
		jse.executeScript("scroll(0, 250)");
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	
	@Test(priority=-8)
	public void testSendValueToTextBox() throws InterruptedException
	{
       WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		
		RunMultiBrowsers.driver.switchTo().frame(fr);
		Thread.sleep(5000);
		
		WebElement myDynamicElement = (new WebDriverWait(RunMultiBrowsers.driver, 20))
				  .until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//input[contains(@class,'ui-widget-content ui-autocomplete-input')]")));	
		myDynamicElement.click();
		myDynamicElement.sendKeys(KC_EnumeratedClass.textBox);
		
		 RunMultiBrowsers.driver.findElement(By.cssSelector("h1.newhead")).click();
		 
		 RunMultiBrowsers.driver.switchTo().defaultContent();
		 Thread.sleep(5000);
	}
	
	@Test(dependsOnMethods={"testSendValueToTextBox"})
	public void testVerifyMoreLinkAndClickOnIt() throws InterruptedException
	{
		  WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
			
			RunMultiBrowsers.driver.switchTo().frame(fr);
		
			
			
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("a.themeinfoclass"));
		System.out.println("More Link is Present - " +element.isDisplayed());
		
		Actions builder = new Actions(RunMultiBrowsers.driver);
        Action mouseOverHome = builder.click(element).build();
		
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
	
	@Test(dependsOnMethods={"testVerifyMoreLinkAndClickOnIt"})
	public void testClickOnNextButton() throws InterruptedException
	{  
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
	
	RunMultiBrowsers.driver.switchTo().frame(fr);
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("button.skip.btn-tran-skip"));
		element.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
	
	}

package surveyListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class DynamicTextEntry {

	@Test(priority=-10)
	public void testVerifyQuestion()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector(".newhead"));
		String actual = element.getText();
		String expected = KC_EnumeratedClass.Question3;
		Assert.assertEquals(actual, expected);
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-9)
	public void testSendvalueToTextBox()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
				(By.xpath("//input[@class='ui-widget-content ui-autocomplete-input']"));
		element.sendKeys(KC_EnumeratedClass.testBox);
		
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-8)
	public void testClickOnAddResponseButton() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
				(By.xpath("//button[@class='addQuestion ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"));
		element.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(10000);
	}
	
	//@Test(dependsOnMethods={"testClickOnAddResponseButton"})
	public void testSendValueToTextBox()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element =  RunMultiBrowsers.driver.findElement
		                     (By.xpath("//input[contains(@class,'ui-widget-content ui-autocomplete-input firepath-matching-node')]"));
		element.click();
		element.sendKeys(KC_EnumeratedClass.testBox2);
		
		
		
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	
	@Test(priority=-7)
	public void testClickOnMoreLink()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
				              (By.cssSelector("a.themeinfoclass"));
		
		Actions builder = new Actions(RunMultiBrowsers.driver);
        Action mouseOverHome = builder.click(element).build();
        
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-6)
	public void testClickOnSkipButton() throws InterruptedException
	{ 
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
                             (By.cssSelector(".skip.btn-tran-skip"));
		element.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
}

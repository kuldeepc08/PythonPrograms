package surveyListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class TextEntry {
	@Test(priority=-10)
	public void testVerifyQuestionImg()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
                              (By.cssSelector("img.img-responsive"));
		System.out.println("Image is present - " +element.isDisplayed());
		
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-9)
	public void testVerifyQuestion()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
                                   (By.cssSelector("h1.newhead"));
		String actual = element.getText();
		String expected = KC_EnumeratedClass.Question8;
		Assert.assertEquals(actual, expected);
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-8)
	public void testEnterValueInTextBox()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
                              (By.xpath("//input[contains(@class,'question_12492 inputbox')]"));
		element.click();
		element.sendKeys(KC_EnumeratedClass.textBox1);
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-7)
	public void testClickOnMoreLink() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
				              (By.cssSelector("a.themeinfoclass"));
		
		Actions builder = new Actions(RunMultiBrowsers.driver);
        Action mouseOverHome = builder.click(element).build();
        
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
	@Test(priority=-6)
	public void testClickOnNextButton() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.
				findElement(By.cssSelector("button.save.btn-tran-save"));
		element.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
}

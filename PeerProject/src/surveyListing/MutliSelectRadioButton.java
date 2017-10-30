package surveyListing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class MutliSelectRadioButton {

	@Test(priority=-10)
	public void testVerifyImage()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.cssSelector("iframe#surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("img.img-responsive"));
		System.out.println("Question img is Displayed - " +element.isDisplayed());
		
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-9)
	public void testVerifyQuestions()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector(".newhead"));
		String actual = element.getText();
		String expected =KC_EnumeratedClass.Question6;
		Assert.assertEquals(actual, expected);
		
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-8)
	public void testPrintAllDataFromTable()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement table = RunMultiBrowsers.driver.findElement
				                  (By.cssSelector(".matrixtable"));
		List<WebElement> rows =
				table.findElements(By.tagName("tr"));
		
		for (WebElement row : rows) {
			List<WebElement> cols =
			row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
			System.out.print(col.getText() + "\t");
			}
			System.out.println();
			}
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-7)
	public void testSelectRadioButtons()
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		List<WebElement> radio = RunMultiBrowsers.driver.findElements(By.name("response_1"));
		radio.get(0).click();
		radio.get(6).click();
		radio.get(12).click();
		radio.get(18).click();
		
		
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-6)
	public void testClickOnMoreLink() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement radio = RunMultiBrowsers.driver.findElement(By.cssSelector("a.themeinfoclass"));
		radio.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
	@Test(priority=-5)
	public void testClickOnNextButton() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
	WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("button.save.btn-tran-save"));
		element.click();
		RunMultiBrowsers.driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}
}

package surveyListing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;


public class SuveryInfo {
	
	@Test(priority=-10)
	public void testVerifyProfileTextArePresentOnTheSurvey() throws InterruptedException
	{
		List<WebElement> text = RunMultiBrowsers.driver.findElements(By.cssSelector("div.text-center fontSize12"));
		for (int i = 0; i < text.size(); i++) {
			System.out.println(text.get(i).getText());
		}
		Thread.sleep(5000);
	}
	@Test(priority=-9)
	public void testVerifyProfileImageIsPresent()
	{
		boolean img = RunMultiBrowsers.driver.findElement(By.cssSelector("img#profileImgIcon")).isDisplayed();
		System.out.println("Profile image is present or not - " +img);
	}
	
	
	public void testVerifySurveyName() throws InterruptedException
	{
		 WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		Thread.sleep(5000);
		
		String actual = RunMultiBrowsers.driver.findElement(By.tagName("span")).getText();
		actual=actual.substring(1, 10);
		String expected = KC_EnumeratedClass.SurveyName;
		Assert.assertEquals(actual, expected);
	}
	
}

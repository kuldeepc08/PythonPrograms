package surveyListing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class SurveyList {

	public void testVerifyHeaderText() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		
		RunMultiBrowsers.driver.switchTo().frame(fr);
		Thread.sleep(5000);
		
		WebElement element = RunMultiBrowsers.driver.findElement
				              (By.cssSelector("div.secondheadermsgleft.theme1"));
		String actual = element.getText();
		String expected = "Activities to Complete";
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=-10)
	public void testSurveyButton() throws InterruptedException
	{
        WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		
		RunMultiBrowsers.driver.switchTo().frame(fr);
		Thread.sleep(5000);
		
				List<WebElement> eleemnt = RunMultiBrowsers.driver.findElements(By.id("submit-margin"));
				System.out.println("Print the size " +eleemnt.size());
				eleemnt.get(1).click();
				RunMultiBrowsers.driver.switchTo().defaultContent();
				Thread.sleep(10000);
	}
	

}

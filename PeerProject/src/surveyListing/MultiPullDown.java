package surveyListing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class MultiPullDown {

	
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
		String expected = KC_EnumeratedClass.Question4;
		Assert.assertEquals(actual, expected);
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	@Test(priority=-8)
	public void testChooseOneAnswer() throws InterruptedException
	{
		WebElement fr = RunMultiBrowsers.driver.findElement(By.id("surveysIframe"));
		RunMultiBrowsers.driver.switchTo().frame(fr);
		
		WebElement element = RunMultiBrowsers.driver.findElement
                               (By.xpath("//select[@class='themeselectclass2']"));
		Select drop = new Select(element);
		List<WebElement> list=drop.getOptions();
		for(int i=0;i<list.size();i++)          
		    {
		        System.out.println(list.get(i).getText());
		    }
		if(list.size()<=1)
		{
			System.out.println("There is no items in the list");
			RunMultiBrowsers.driver.findElement
			                  (By.cssSelector("button.skip.btn-tran-skip")).click();
		}
		else
		{
			drop.selectByValue("2");
			Thread.sleep(5000);
			RunMultiBrowsers.driver.findElement
            (By.cssSelector("button.save.btn-tran-save")).click();
		}
		RunMultiBrowsers.driver.switchTo().defaultContent();
	}
	
}

package surveyListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class CalendarQuestion {

	/*@Test(priority=-10)
	public void testVerifyQuestionImg()
	{
		WebElement element = RunMultiBrowsers.driver.findElement
                              (By.cssSelector("img.img-responsive"));
		System.out.println("Image is present - " +element.isDisplayed());
	}*/
	@Test(priority=-9)
	public void testVerifyQuestion()
	{
		WebElement element = RunMultiBrowsers.driver.findElement
                                   (By.cssSelector("h1.newhead"));
		String actual = element.getText();
		String expected = KC_EnumeratedClass.Question;
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=-8)
	public void testSelectDateFromCalendar() throws InterruptedException
	{
		WebElement element = RunMultiBrowsers.driver.findElement
                                (By.id("dp1489121281669"));
		element.click();
		Thread.sleep(5000);
		
		//Select Month
		WebElement month = RunMultiBrowsers.driver.findElement
				            (By.cssSelector("select.ui-datepicker-month"));
		Select drop = new Select(month);
		drop.selectByVisibleText(KC_EnumeratedClass.Month);
		Thread.sleep(5000);
		
		//Year
		WebElement year = RunMultiBrowsers.driver.findElement
	            (By.cssSelector("select.ui-datepicker-year"));
         Select dropDown = new Select(year);
         dropDown.selectByVisibleText(KC_EnumeratedClass.Year);
          Thread.sleep(5000);
          
          //Date
          RunMultiBrowsers.driver.findElement(By.linkText(KC_EnumeratedClass.Date)).click();
          Thread.sleep(5000);
	}
	@Test(priority=-7)
	public void testClickonMoreLink()
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("a.themeinfoclass"));
		element.click();
	}
	@Test(priority=-6)
	public void testClickOnNextButton() throws InterruptedException
	{
	WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("button.save.btn-tran-save"));
		element.click();
		Thread.sleep(5000);
	}

}

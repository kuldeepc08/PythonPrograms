package surveyListing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class MultiSelectWithCheckBox {
	
	@Test(priority=-10)
	public void testVerifyQuestionImg()
	{
		WebElement element = RunMultiBrowsers.driver.findElement
                              (By.cssSelector(".img-responsive"));
		System.out.println("Image is present - " +element.isDisplayed());
	}
	@Test(priority=-9)
	public void testVerifyQuestion()
	{
		WebElement element = RunMultiBrowsers.driver.findElement
                                   (By.cssSelector("h1.newhead"));
		String actual = element.getText();
		String expected = KC_EnumeratedClass.Question7;
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=-8)
	public void testPrintCheckBoxname()
	{
		WebElement table = RunMultiBrowsers.driver.findElement
                (By.xpath("//table"));
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
	}
	@Test(priority=-7)
	public void testSelectCheckBox()
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.id("question_4285_3"));
		element.click();
	}
	@Test(priority=-6)
	public void testClickonMoreLink()
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("a.themeinfoclass"));
		element.click();
	}
	@Test(priority=-5)
	public void testClickOnNextButton() throws InterruptedException
	{
	WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("button.save.btn-tran-save"));
		element.click();
		Thread.sleep(5000);
	}
}

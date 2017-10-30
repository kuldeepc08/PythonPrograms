package surveyListing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import multiBrowsers.RunMultiBrowsers;

public class SingleRadioButton {
	
	@Test(priority=-10)
	public void testVerifyQuestionImg()
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector(".img-responsive"));
		System.out.println("Question img is Displayed - " +element.isDisplayed());
	}
	@Test(priority=-9)
	public void testAllRadioButtonsName()
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
	@Test(priority=-8)
	public void testSelectRaadioButton() throws InterruptedException
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.id("choice_4286_1"));
		element.click();
		Thread.sleep(5000);
	}
	
	@Test(priority=-7)
	public void testClickOnNextButton() throws InterruptedException
	{
	WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector(".save.btn-tran-save"));
		element.click();
		Thread.sleep(5000);
	}
}

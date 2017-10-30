package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import multiBrowsers.RunMultiBrowsers;

public class PassWordClass {
	
	/*@Test(priority=-4)
	public void testVerifyImgIsDisplayed()
	{
		boolean element = RunMultiBrowsers.driver.findElement(By.cssSelector("img.img-polaroid")).isDisplayed();
		System.out.println("Is Profile is present or not " +element); 
	}*/
	/*@Test(priority=-3)
	public void testCheckCaption()
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("#signinFormPassword>span"));
		String actual = element.getText().trim().substring(7, element.getText().trim().length());
		
		String expected = "pooja";
		Assert.assertEquals(actual.trim(), expected);
	}*/
	@Test(priority=-2)
	public void testSendValueToPassword() throws InterruptedException
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("input#j_password"));
		//element.sendKeys(KC_EnumeratedClass.LoginPass);
		element.sendKeys("Pooja168");
		
	}
	@Test(priority=-1)
	public void testClickOnSignInButton() throws InterruptedException
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("input#passwordBtn"));
		element.click();
		Thread.sleep(20000);
	}
	/*@Test(dependsOnMethods = {"testClickOnSignInButton"})
	public void tesVerifySuccessfulUrl()
	{
		String actual = RunMultiBrowsers.driver.getCurrentUrl();
		String expected = "http://138.197.85.124/portal/474#/userAccount";
		Assert.assertEquals(actual, expected);
	}*/
	

}

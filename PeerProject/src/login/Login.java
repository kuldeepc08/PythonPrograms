package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import kcPackage.KC_EnumeratedClass;
import model.ChallengeAns;
import multiBrowsers.RunMultiBrowsers;

public class Login {

	@Test(priority=-10)
	public void testVerifySignUpText()
	{
		 WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("div.modal-title"));
		 String actual = element.getText();
		 String expected = "Sign Up";
		 Assert.assertEquals(actual, expected);
	}
	@Test(priority=-9)
	public void testVerifyTextBoxHeader()
	{
		WebElement element = RunMultiBrowsers.driver.findElement
				              (By.cssSelector("h3.form-signin-heading.bold.fontSize18"));
		String actual = element.getText();
		String expected = "Returning user?";
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=-8)
	public void testEnterValuesInEmailTextBox()
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.id("u"));
		element.sendKeys(KC_EnumeratedClass.LoginEmail);
	}
	@Test(priority=-7)
	public void testClickOnSignInButton() throws InterruptedException
	{
		WebElement element = RunMultiBrowsers.driver.findElement(By.id("loginSignInBtn"));
		element.click();
		Thread.sleep(5000);
	}
	@Test(priority=-6)
	public void testVerifyChallengeQuestionHeading() throws InterruptedException
	{
		String actual = RunMultiBrowsers.driver.findElement(By.cssSelector("div.modal-title")).getText();
		String expected = "Answer Challenge Questions";
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=-5)
	public void testSendvaluesToQuestions()
	{
		final ChallengeAns objChallengeAns = new ChallengeAns();
		objChallengeAns.setQues1(KC_EnumeratedClass.SetQues1);
		objChallengeAns.setQues2(KC_EnumeratedClass.SetQues2);
		objChallengeAns.setQues3(KC_EnumeratedClass.SetQues3);
		
		objChallengeAns.setAns1(KC_EnumeratedClass.SetAns1);
		objChallengeAns.setAns2(KC_EnumeratedClass.SetAns2);
		objChallengeAns.setAns3(KC_EnumeratedClass.SetAns3);
		
		   List<WebElement> element = RunMultiBrowsers.driver.findElements(By.cssSelector("#signinFormQuestions>h5"));
		   System.out.println(element.size());
		   if(element.size()==2)
		   {
		   String first = element.get(0).getText();
		   System.out.println(first);
		   System.out.println(objChallengeAns.getQues1());
		   
		   
		        if(first.equals(objChallengeAns.getQues1()))
		        {
		        	System.out.println("H1" + objChallengeAns.getAns1());
		        	RunMultiBrowsers.driver.findElement(By.id("a1")).sendKeys(objChallengeAns.getAns1());
		        	
		        }
		        else if(first.equals(objChallengeAns.getQues2()))
		        {
		        	System.out.println("H2" + objChallengeAns.getAns2());
		        	RunMultiBrowsers.driver.findElement(By.id("a1")).sendKeys(objChallengeAns.getAns2());
		        }
		        else if(first.equals(objChallengeAns.getQues3()))
		        {
		        	System.out.println("H3"+ objChallengeAns.getAns3());
		        	RunMultiBrowsers.driver.findElement(By.id("a1")).sendKeys(objChallengeAns.getAns3());
		        }
		        
		        
		        String second = element.get(1).getText();
				   
		        if(second.equals(objChallengeAns.getQues1()))
		        {
		        	RunMultiBrowsers.driver.findElement(By.id("a2")).sendKeys(objChallengeAns.getAns1());
		        }
		        else if(second.equals(objChallengeAns.getQues2()))
		        {
		        	RunMultiBrowsers.driver.findElement(By.id("a2")).sendKeys(objChallengeAns.getAns2());
		        }
		        else if(second.equals(objChallengeAns.getQues3()))
		        {
		        	RunMultiBrowsers.driver.findElement(By.id("a2")).sendKeys(objChallengeAns.getAns3());
		        }
		   }
	}
	
	@Test(dependsOnMethods={"testSendvaluesToQuestions"})
	public void testClickOnSigninButtonForLogin() throws InterruptedException
	{
		RunMultiBrowsers.driver.findElement(By.cssSelector(".btn.btn-large.signup.bold")).click();
		Thread.sleep(15000);
		WebElement element = RunMultiBrowsers.driver.findElement(By.cssSelector("#j_password"));
		//element.sendKeys(KC_EnumeratedClass.LoginPass);
		element.sendKeys("Pooja168");
		
		WebElement element2 = RunMultiBrowsers.driver.findElement(By.cssSelector("input#passwordBtn"));
		element2.click();
		Thread.sleep(20000);
	}

}

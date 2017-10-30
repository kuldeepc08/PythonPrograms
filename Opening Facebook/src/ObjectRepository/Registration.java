package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import TestCases.WebDriverClass;

public class Registration {
	
	
	public Registration()
	{
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(WebDriverClass.getInstance().getWebDriver(), 100);
		PageFactory.initElements(WebDriverClass.getInstance().getWebDriver(), this);
		
	}
	
	@FindBy(css="label#menu_login_show_link")
	WebElement loginBtn;
	
	@FindBy(name="email")
	WebElement UserName;
	
	@FindBy(name="pass")
	WebElement Password;
	
	@FindBy(css="[type='submit']")
	WebElement SignInBtn;
	
	

	public WebElement clickOnLogin()
	{
		return loginBtn;
	}
	
	public WebElement sendUserName(String username)
	{
		//UserName.sendKeys(username);
		return UserName;
	}
	public WebElement sendUserPassword(String userPass)
	{
		//Password.sendKeys(userPass);
		return Password;
	}
	public WebElement clickSignInButton()
	{
		//SignInBtn.click();
		return SignInBtn;
	}
}

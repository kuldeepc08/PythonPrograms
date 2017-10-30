package tpProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"E:\\Selenium Jars\\Selenium 3\\geckodriver-v0.19.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> element = driver.findElements(By.cssSelector("[type='radio']"));
	    System.out.println(element.size());

	}

}

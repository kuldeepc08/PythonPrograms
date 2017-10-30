package tpProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadDataFromTable {
	WebDriver driver;
	
	public void readData()
	{
		WebElement element = driver.findElement(By.xpath("//"));
		List <WebElement> colData = element.findElements(By.tagName(""));
		int colSize = colData.size();
		
		for (int i = 0; i < colSize; i++) {
			
			List<WebElement> rowData = colData.get(i).findElements(By.tagName("//"));
		    int rowCount = rowData.size();
		    for (int j = 0; j < rowCount; j++) {
		    	System.out.println(rowData.get(j).getText());
			}
			
		}
	}

}

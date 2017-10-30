package tpProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@DataProvider(name="getData", parallel=true)
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		data[0][0]="";
		data[0][1]="";
		data[0][2]="";
		
		data[1][0]="";
		data[1][2]="";
		data[1][3]="";
		
		return data;
	}
	
	@Test(dataProvider="getData")
	public void Login(String username, String password, String name)
	{
		
	}
}

package javaRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TestNGDataDrivenTesting {

	
	@Test(dataProvider="testsample")
	public void LoginwithData(String username,String password)
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("username"+ "  " + username +"  "+ "password" + "  "+ password);
		
		driver.close();
	}
	
	
	
	@DataProvider(name = "testsample")
	public Object[][] testdata()
	{
		{
			return new Object[][]
					{
				{"standard_user","secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
						
					};
		}
		
	}
	
	
	}


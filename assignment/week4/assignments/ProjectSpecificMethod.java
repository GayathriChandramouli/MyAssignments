package week4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		//Launch the browser
		driver = new ChromeDriver();		
		//Load the url
		driver.get("https://login.salesforce.com/");		
		// maximize the window 
		driver.manage().window().maximize();
		//Login to the leaftaps
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.id("Login")).click();
		
		
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	
	
}
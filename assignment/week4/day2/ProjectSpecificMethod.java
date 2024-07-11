package week4.day2;

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
		driver.get("http://leaftaps.com/opentaps");		
		// maximize the window 
		driver.manage().window().maximize();
		//Login to the leaftaps
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on the leads tab
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	
	
}
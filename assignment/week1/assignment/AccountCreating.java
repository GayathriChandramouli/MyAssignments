package week1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountCreating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//initiate chrome driver
		ChromeDriver driver=new ChromeDriver();
		
		//using the driver object access the website
		driver.get("http://leaftaps.com/opentaps");
		
		//for maximizing the window
		driver.manage().window().maximize();
		
		//to input the user name and password to the text box for logging in the website
		WebElement usernamefield=driver.findElement(By.id("username"));
		usernamefield.sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Accounts" tab.
		 driver.findElement(By.linkText("Accounts")).click();
		 
		 //Click on the "Create Account" button.
		 driver.findElement(By.linkText("Create Account")).click();
		 
		//Inspect accountName field and enter accountName value
		 driver.findElement(By.id("accountName")).sendKeys("G3Auto");
		 
		 //Inspect description field and enter description value
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				 
		//Inspect numberEmployees field and enter numberEmployees value
		 driver.findElement(By.id("numberEmployees")).sendKeys("100");
		 
		//Inspect SiteName field and enter SiteName value
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 
		 // Click the "Create Account" button
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 //Verify that the Title is displayed correctly
		 String PageTitleName= driver.getTitle();
		 System.out.println("PageTitleName is :  "+PageTitleName);
		 
		 if(PageTitleName.equals("Account Details | opentaps CRM"))
		 {
		//Display the message in console
		 System.out.println("PageTitleName displayed correctly") ;
		 }
		 else
		 {
		 System.out.println("PageTitleName is not displayed correctly") ;	
		 }		
		 
		//Wait for 2 seconds
		 Thread.sleep(2000);
		 
		 //Close browser
		 driver.close();
		
	}

}

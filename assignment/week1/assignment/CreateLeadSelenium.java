package week1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadSelenium {

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
		
		//Accessing the Lead tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Inspect FirstName field and enter FirstName value
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");

		 //Inspect LastName field and enter LastName value
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandramouli");
		 
		//Inspect CompanyName field and enter CompanytName value
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TechM");
		 
		//Inspect Title field and enter Title value
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLead");
		 
		 // Click the "Create Lead" button
		 driver.findElement(By.name("submitButton")).click();
		 
		 //Verify that the Title is displayed correctly
		 String PageTitleName= driver.getTitle();
		 System.out.println("PageTitleName is :  "+PageTitleName);
		 
		 if(PageTitleName.equals("View Lead | opentaps CRM"))
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

package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
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
		
		//Click on create lead from menu
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Inspect CompanyName field and enter CompanytName value
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SampleEdit11");
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sakshi");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Arun");
		
		//Enter the local name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("sakshi");
		
	    //Enter the department name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		//Enter the decription details
		driver.findElement(By.id("createLeadForm_description")).sendKeys("sample edit lead");
		
		//Enter the email id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sakshimouli@gmail.com");
		
		//Provide state/province using visible text		
		 WebElement stateProvinceWE  = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select stateProvinceDD = new Select(stateProvinceWE);
		 stateProvinceDD.selectByVisibleText("New York");
		 
		 //create the lead data
		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		 
		 //Edit the lead data
		 driver.findElement(By.linkText("Edit")).click();
		 
		 //clear the desciption detail text area
		 driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_description']")).clear();
		 
		 //input data to important note text area
		 driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Edit lead by clearing description");
		 
		 //click on update button
		 driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		 
		 //get the title of the page after update action
		 System.out.println("The Title of the page is " +driver.getTitle());
		
		 Thread.sleep(5000);
		 driver.close();
	}

}

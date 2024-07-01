package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
				
				//click on find lead button
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				
				//click on phone tab
				driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
				
				//input the phone number for finding leads
				driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("95000");
				
				//click on find leads
				driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
				
				//find the first record of lead displayed
				
				Thread.sleep(3000);

				WebElement leadid=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"));
				String st=leadid.getText();
				System.out.println(st);
				leadid.click();
				
				//Delete the Lead id
				WebElement delete=driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButtonDangerous']"));
				delete.click();
				
				//click on find lead button
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				
				//provide lead id as input to verfiy if it is available 				
				driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='id']")).sendKeys(st);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(5000);
				
				
				String RecList = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
				System.out.println("No. of Records found: " + RecList);
				
                // verify if no records found is successful or not after deletion of record
				if (RecList.equals("No records to display")) {
					System.out.println("Lead List verified successfully");
				} else {
					System.out.println("Lead List verification failed");
				}
				
				

				
				

	}

}

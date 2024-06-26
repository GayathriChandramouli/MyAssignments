package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch browser
			ChromeDriver driver = new ChromeDriver();
				
			//get the url
			driver.get("http://leaftaps.com/opentaps/control/main");
				
			//maximize the window
			driver.manage().window().maximize();
				
			//locate username and password using Relative xpath (attribute based) and enter value
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
			driver.findElement(By.xpath("//input[@type='password'] ")).sendKeys("crmsfa");
				
			//locate login using xpath (attribute based) and click 
			driver.findElement(By.xpath("//input[@type='submit'] ")).click();
				
			//locate and click the link using xpath(partial text match)
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				
			// locate and click account and create account using xpath(text based)
				
			driver.findElement(By.xpath("//a[text()='Accounts']")).click();
			driver.findElement(By.xpath("//a[text()='Create Account']")).click();
			
			// locate and Enter the username
			driver.findElement(By.id("accountName")).sendKeys("SampleAccount1");
			
			//locate and enter description
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			
			//Select dropdown of industry using index
			
			 WebElement industryWE = driver.findElement(By.name("industryEnumId"));
			 Select industryDD = new Select(industryWE);
			 industryDD.selectByIndex(3);
			 
			 //Select dropdown of ownership using visible text
			 
			 WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
			 Select ownershipDD = new Select(ownershipWE);
			 ownershipDD.selectByVisibleText("S-Corporation");
			 
			 //Select drop down of Source using select by value
			 
			 WebElement sourceWE= driver.findElement(By.id("dataSourceId"));
			 Select sourceDD=new Select(sourceWE);
			 sourceDD.selectByValue("LEAD_EMPLOYEE");
			 
			 //select dropdown of marketing campaign using index
			 
			 WebElement marketingCampaignWE = driver.findElement(By.id("marketingCampaignId"));
			 Select marketingCampaignDD = new Select(marketingCampaignWE);
			 marketingCampaignDD.selectByIndex(6);
			 
			 //Select dropdown of province using select by value
			 
			 WebElement provinceWE = driver.findElement(By.id("generalStateProvinceGeoId"));
			 Select provinceDD = new Select(provinceWE);
			 provinceDD.selectByValue("TX");
			 
			 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
			    Thread.sleep(6000);
			    
			    String accountName = driver.findElement(By.xpath("//span[@class='requiredField']/following::span")).getText();
			    System.out.println(accountName);
			    if (accountName.contains("Sample")) {
					System.out.println("The Expected Title and the Actual Title are same");
				} else {
					System.out.println("The Expected Title and the Actual Title are different");
				}
				
		     Thread.sleep(5000);
			 driver.close();
			 	
			
	}

}

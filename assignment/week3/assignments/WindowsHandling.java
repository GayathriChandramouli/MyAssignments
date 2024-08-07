package week3.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']/..")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> contacts = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(contacts.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(contacts.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]/..")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> contacts1 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(contacts1.get(1));
		driver.findElement(By.xpath("(//tbody)[4]/tr/td[@tabindex='0']")).click();
		driver.switchTo().window(contacts1.get(0));
		WebElement mergeClick = driver.findElement(By.xpath("//a[text()='Merge']"));
		mergeClick.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String expectedTitle = "Merge Contacts | opentaps CRM";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) 
		{
			System.out.println("The Title is verified: " + actualTitle);
		}
		else
		{
			System.out.println("The Title is not verified. Actual Title: " + actualTitle);
     	}
   }
}

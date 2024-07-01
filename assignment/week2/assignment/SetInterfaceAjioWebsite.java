package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SetInterfaceAjioWebsite {
	
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeDriver driver= new ChromeDriver();
		// - Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='searchVal']"));
		searchBox.sendKeys("bags");
		Thread.sleep(4000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='Men']//following-sibling::label")).click();
		// - Under "Category" click "Fashion Bags"
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']//following-sibling::label")).click();
	
		Thread.sleep(5000);
		String itemCount = driver.findElement(By.xpath("//div[@class=' filter-container']//div[@class='length']"))
				.getText();
		System.out.println("Item Count:" + itemCount);
		
		// Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<WebElement> brandSet = new HashSet<WebElement>(brandList);
		System.out.println("Available Brand List:");
		for (WebElement list : brandSet) {
			System.out.println(list.getText());
		}
		// list. - Get the list of names of the bags and print it
		 List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		 System.out.println("Available Bags");
		 for(WebElement bagNames:bagNameList) {
			 System.out.println(bagNames.getText());
		 }
	driver.close();
		
	}

}

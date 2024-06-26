package week2.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the driver
		ChromeDriver driver = new ChromeDriver();
		
		//access the leaf ground url
		driver .get("https://leafground.com/button.xhtml");
		//maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		String title = driver.getTitle();
		String expectedTitle="Dashboards";
		if(title.equals(expectedTitle))
		{
		System.out.println("The Expected title and the actual title are same");
		}
		else
		{
		System.out.println("The Expected title and the actual title are not same");
		}
		
		
		driver .get("https://leafground.com/button.xhtml");
		WebElement buttonDisabled = driver.findElement(By.name("j_idt88:j_idt92"));
		Boolean disabledButton = buttonDisabled.isEnabled();
		System.out.println("The button is Disabled " +disabledButton);
		
		WebElement buttonSubmit = driver.findElement(By.xpath("//span[text() = 'Submit']"));
		org.openqa.selenium.Point submitButton = buttonSubmit.getLocation();
		System.out.println("Location of the Button is  " +submitButton);
		
		
		WebElement saveColour = driver.findElement(By.xpath("//span[text() = 'Save']"));
		String Colour = saveColour.getCssValue("background-color");
		System.out.println("Colour of the Button is  " +Colour);
		
		WebElement heightWidth = driver.findElement(By.name("j_idt88:j_idt98"));
		Dimension width = heightWidth.getSize();
		System.out.println("Height and Width of the Button is  " +width);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}

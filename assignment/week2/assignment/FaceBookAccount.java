package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccount {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - Initialize ChromeDriver
				ChromeDriver driver = new ChromeDriver();
				// Open url
				driver.get("https://en-gb.facebook.com/");
				//- Maximize the browser window
				driver.manage().window().maximize();
				//- Add an implicit wait to ensure the web page elements are fully loaded
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//- Click on the Create new account button.
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				//- Enter the First name.
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gayathri");
				//- Enter the Surname.
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mouli");
				//- Enter the Mobile number or email address.
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Gayathrimouli85@gmail.com");
				//- Enter the New password.
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sample@123");
				//- Handle all three dropdowns in Date of birth
				WebElement daydd = driver.findElement(By.id("day"));
				Select dayDropDown=new Select(daydd);
				dayDropDown.selectByVisibleText("4");
				WebElement monthdd = driver.findElement(By.id("month"));
				Select monthDropDown=new Select(monthdd);
				monthDropDown.selectByValue("7");
				WebElement yeardd = driver.findElement(By.id("year"));
				Select yearDropDown=new Select(yeardd);
				yearDropDown.selectByVisibleText("1985");
				//- Select the radio button in Gender.
				driver.findElement(By.xpath("//label[text()='Female']/following::input")).click();
				
	}

}

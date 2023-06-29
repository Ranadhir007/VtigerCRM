package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Baseclass1 {
	WebDriver driver;
	@BeforeTest
	public void Setup() {
		 driver=new ChromeDriver();
		driver.get("https://www.oursuswamy.com/");
		system.out.println("swamy project");
		driver.manage().window().maximize();
	}
@Test
	public void login() {
	driver.findElement(By.tagName("(//span[@class='_aa4a'])[1]")).sendKeys("659529795328");
		
	}

}

package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithAsserts {
	WebDriver driver;
	
	@BeforeTest
	public void  setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void urlTest() {
		driver.get("https://www.google.com");
		String expTitle="Google";
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle,expTitle);
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	

}

package pkg17TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EndToEndTestFlow  {
public static WebDriver driver;
	@BeforeMethod
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

	}

	@Test
	public void login(WebDriver driver) {
		
		WebElement username=driver.findElement(By.xpath(""));
		username.sendKeys("admin");
		
	}
	
}

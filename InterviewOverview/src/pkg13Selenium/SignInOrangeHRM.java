package pkg13Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInOrangeHRM {
	public void signIn() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement usrname = driver.findElement(By.xpath("//input[@name='username']"));
		usrname.sendKeys("Admin");

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.click();

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		Thread.sleep(2000);

		driver.getCurrentUrl();
		driver.getTitle();
		

	}
}

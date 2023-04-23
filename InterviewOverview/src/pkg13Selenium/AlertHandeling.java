package pkg13Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandeling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();

		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
	}

}

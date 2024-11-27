package pkg13Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/implicit-wait-example");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Check box appear after every 10 seconds

		for (int i = 1; i <= 5; i++) {
			WebElement checkbox1 = driver.findElement(By.xpath("//div[@id='q']//input[" + i + "]"));
			checkbox1.click();
		}

	}

}

package pkg13Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement hotels=driver.findElement(By.xpath("//a[text()='Hotels']"));
		hotels.click();
		

		Set<String> winIDS = driver.getWindowHandles();
		for (String winID : winIDS) {
			System.out.print(winID);
		}
	}

}

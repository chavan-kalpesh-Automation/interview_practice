package pkg13Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		
		
		
		//Declare & initialization of fluent wait 
		FluentWait wait = new FluentWait<WebDriver>(driver)
				//Specify timeout for wait 
				.withTimeout(Duration.ofSeconds(10))
				//Specify polling time 
				.pollingEvery(Duration.ofSeconds(2))
				//specify what exception to ignoring 
				.ignoring(NoSuchElementException.class);
	}

}

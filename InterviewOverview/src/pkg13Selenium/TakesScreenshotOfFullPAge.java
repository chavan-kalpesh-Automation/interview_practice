package pkg13Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotOfFullPAge {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
		File source = takesscreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\SCreenShot Files\\guru99HomePage.jpg");
		FileHandler.copy(source, destination);

	}

}

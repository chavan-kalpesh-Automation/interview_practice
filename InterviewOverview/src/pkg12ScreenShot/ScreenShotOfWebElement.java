package pkg12ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://snjb.org");

		WebElement snjblogo = driver.findElement(By.xpath("//img[@src='images/form-snjb-logo.png']"));

		File source = snjblogo.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\SCreenShot Files\\snjblogo.png");
		FileHandler.copy(source, destination);
	}
}

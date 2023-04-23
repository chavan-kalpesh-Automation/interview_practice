package pkg12ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtilityClass {
	public static WebDriver driver;

	public static void browserlaunching() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com");
		driver.manage().window().maximize();

		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\SCreenShot Files\\Guru99.jpg");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		
		
		
		
		WebElement softwareTesting = driver.findElement(By.xpath("//a[text()='➤ Software Testing']"));
		softwareTesting.click();

		WebElement stAsCarrer = driver.findElement(By.xpath("//a[text()='QA as your career']"));
		stAsCarrer.click();

		Thread.sleep(2000);

		WebElement image = driver.findElement(By.xpath("//img[@class='entered lazyloaded']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoview", image);
		Thread.sleep(2000);

		File source1 = image.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("F:\\SCreenShot Files\\Guru99Image.jpg");
		FileHandler.copy(source1, destination1);

	}

	

	
	public static void main(String[] args) throws IOException, InterruptedException {
		browserlaunching();
		
	}

}

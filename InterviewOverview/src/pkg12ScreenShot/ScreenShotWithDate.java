package pkg12ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//take multiple screenshot

public class ScreenShotWithDate {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://snjb.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Date currentdate = new Date();

		// String date = currentdate.toString().replace("_", "").replace(":", "");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		int count = 1;
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File detination = new File("F:\\SCreenShot Files\\" + sdf.format(currentdate) + count + ".png");
		count++;
		FileHandler.copy(source, detination);

		Thread.sleep(2000);

		WebElement skippage = driver.findElement(By.xpath("//a[text()='Skip This Page']"));
		skippage.click();

		Thread.sleep(2000);

		TakesScreenshot ss1 = (TakesScreenshot) driver;
		File source1 = ss1.getScreenshotAs(OutputType.FILE);
		File detination1 = new File("F:\\SCreenShot Files\\" + sdf.format(currentdate) + count + ".png");
		count++;

		FileHandler.copy(source1, detination1);
		System.out.println("Second ScreenShot captured");

	}

}

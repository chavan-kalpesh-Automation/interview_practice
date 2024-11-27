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


public class ScreenShotUtility {

	public static WebDriver driver;

	public static void initialization() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	public static void login() {

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

	}

	public static void passtestcasess() throws IOException {

		Date currentDate = new Date();

		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD HH-MM-SS");

		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		int count = 1;
		File destination = new File("F:\\SCreenShot Files\\" + df.format(currentDate) + count + ".png");
		count++;
		FileHandler.copy(source, destination);
		System.out.println("Screenshot taken successfully 01 ");

	}

	public static void failtestcase() throws IOException {
		Date currentDate = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH-MM-SS");

		TakesScreenshot ss = (TakesScreenshot) driver;
		int count = 1;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\SCreenShot Files\\" + sdf.format(currentDate) + count + ".png");
		count++;
		FileHandler.copy(source, destination);
		System.out.println("Screenshot taken successfully 02 ");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		initialization();// browser launch

		passtestcasess(); // 1st screenshot

		Thread.sleep(1000);
		
		login();
		
		Thread.sleep(1000);
		
		failtestcase();
	}

}

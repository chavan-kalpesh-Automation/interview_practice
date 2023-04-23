package pkg7Exception;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SCreenShotEceptionHandeling {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Date currentDate = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH-MM-SS");

		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\SCreenShot Files\\" + sdf.format(currentDate) + ".png");

		FileHandler.copy(source, destination);

	}

}

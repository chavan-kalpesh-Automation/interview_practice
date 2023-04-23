package pkg007;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenshotWithDateAndTimeName {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driber", "F:\\Chrome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Date currentdate = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH-MM-SS");
		int count = 1;
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\SCreenShot Files" + sdf.format(currentdate) + count + ".jpg");
		count++;
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
}

package pkg18propertiesfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertiesFileDataUsing extends PropertiesFileRead {

	public static WebDriver driver;

	public static void browserlaunching() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL from properties file
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("Xpath Xpression of locator ")));

	}

	public static void loginmethod() {
		WebElement username = driver.findElement(By.xpath(""));
		username.sendKeys(prop.getProperty("Username"));

		WebElement password = driver.findElement(By.xpath(""));
		password.sendKeys(prop.getProperty("Password"));

		WebElement loginbtn = driver.findElement(By.xpath(""));
		loginbtn.click();

	}

	public static void main(String[] args) {
		browserlaunching();
		loginmethod();

	}

}

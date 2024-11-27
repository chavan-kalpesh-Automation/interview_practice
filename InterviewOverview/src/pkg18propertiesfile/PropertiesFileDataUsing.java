package pkg18propertiesfile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertiesFileDataUsing extends PropertiesClass {

	public PropertiesFileDataUsing() throws IOException {
		// super();

		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// URL from properties file
		System.out.println(driver);

		// Classname.PropertiesCassrefvaraible.getProperty method

		driver.get(PropertiesClass.prop.getProperty("Url"));

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
												
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(prop.getProperty("Username"));

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(prop.getProperty("Password"));

		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();

	}

	public static void main(String[] args) throws IOException {
		
		new PropertiesFileDataUsing();

	}

}
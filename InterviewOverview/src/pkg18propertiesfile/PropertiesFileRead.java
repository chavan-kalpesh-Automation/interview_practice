package pkg18propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Properties file data fetching 

public class PropertiesFileRead {

	public static Properties prop;
	public static WebDriver driver;

	public PropertiesFileRead() throws InterruptedException {
		prop = new Properties();
		try {

			File file = new File("C:\\Users\\VISHAL\\git\\InterviewOverview\\InterviewOverview\\Config.properties");
			FileInputStream ipFile = new FileInputStream(file);

			prop.load(ipFile);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("Url"));
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(prop.getProperty("Username"));
		Thread.sleep(1000);
		WebElement passwd = driver.findElement(By.xpath("//input[@name='password']"));
		passwd.sendKeys(prop.getProperty("Password"));
		Thread.sleep(1000);
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();

	}

	public static void main(String[] args) throws InterruptedException {
		new PropertiesFileRead();

	}
}

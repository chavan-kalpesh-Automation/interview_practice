package pkg18propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileRead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver	", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream file = null;
		try {
			file = new FileInputStream(
					"C:\\Users\\VISHAL\\git\\InterviewOverview\\InterviewOverview\\Config.properties");
			prop.load(file);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	}

}

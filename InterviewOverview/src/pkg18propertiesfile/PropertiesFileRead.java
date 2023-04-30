package pkg18propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Properties file data fetching 

public class PropertiesFileRead {

	public static Properties prop;

	public static void property() {
		prop = new Properties();
		try {
			
			File file=new File("C:\\Users\\VISHAL\\git\\InterviewOverview\\InterviewOverview\\Config.properties");
			FileInputStream ipFile = new FileInputStream(file);
			
			prop.load(ipFile);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("Url"));

	}
}

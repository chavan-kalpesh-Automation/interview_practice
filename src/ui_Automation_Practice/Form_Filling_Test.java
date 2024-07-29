package ui_Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_Filling_Test {
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);

		driver.get("https://practice-automation.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
	}

}

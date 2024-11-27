package pkg13Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
//iframe present  on webpage
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame(0);            //By Index
		driver.switchTo().frame("a077aa5e");   //By iframe ID
		driver.switchTo().frame("name of iframe");
		
	}

}

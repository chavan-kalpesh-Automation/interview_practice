package pkg13Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassHovering {
//mouse hover and drag and drop
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.name("firstName"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(firstname).perform();
		
		
//		Drag and Drop 
		
		WebElement drag=driver.findElement(By.xpath(""));
		WebElement drop =driver.findElement(By.xpath(""));
		
		act.dragAndDrop(drag, drop).perform();
		
	}

}

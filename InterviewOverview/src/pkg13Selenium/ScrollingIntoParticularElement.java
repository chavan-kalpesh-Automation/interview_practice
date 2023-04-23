package pkg13Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollingIntoParticularElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("Scrolling On to Particular Element");

		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", submit);

		Thread.sleep(2000);
		WebElement countries = driver.findElement(By.xpath("//select[@name='country']"));

		Select country = new Select(countries);
		country.selectByValue("INDIA");

		submit.click();
		Thread.sleep(2000);
String title =driver.getTitle();
if(title.equals("Register: Mercury Tours"))
	System.out.println("Regestration successfull ");
else
	System.out.println("Registration failed");
	}

}

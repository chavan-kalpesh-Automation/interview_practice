package pkg13Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandeling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Kalpesh");

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Chavan");

		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("9175966144");

		WebElement email = driver.findElement(By.name("userName"));
		email.sendKeys("test@gmail.com");

		WebElement countries1 = driver.findElement(By.name("country"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", countries1);
		Thread.sleep(1000);

		List<WebElement> countries = driver.findElements(By.xpath("//select[@name='country']"));
		for (WebElement country : countries) {
			if (country.getText().equals("INDIA"))
				country.click();

		}

	}

}

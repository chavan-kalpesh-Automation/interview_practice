package vipinproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Browser {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://shop.donaldson.com/store/en-us/storeLocator");

		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement selectdropdwn = driver
				.findElement(By.xpath("//select[@class='form-control category-form-control-class categoryChkCls']"));

		Select dropdwn = new Select(selectdropdwn);
		dropdwn.selectByVisibleText("Engine & Vehicle");

		WebElement Currentlocation = driver.findElement(By.xpath("//input[@id='pac-input-default']"));

		Currentlocation.sendKeys("95691");

		// List<WebElement> selection
		// =driver.findElements(By.xpath("//input[@id='pac-input-default']"));
		// selection.

		Thread.sleep(2000);

		
		Actions act = new Actions(driver);
		act.moveToElement(Currentlocation).build().perform();
		// act.sendKeys("95691").build().perform();
		act.sendKeys(Keys.DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();

		// WebElement locate =driver.findElement(By.xpath(""));
		// locate.click();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				driver.findElement((By.xpath("//button[@class='btn btn-orange-primary submitInitialSelect']"))));

		
		
		//Locator of search list 
		
		List <WebElement> searchlist=driver.findElements(By.className("bh-sl-loc-list"));
		for(WebElement searchlists:searchlist) {
			System.out.println(searchlists);
		}
		
		
		
		
		


	}
}

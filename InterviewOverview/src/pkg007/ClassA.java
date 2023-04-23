package pkg007;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassA {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
		List<WebElement> months = driver.findElements(By.xpath("xpath Expression"));
		for (WebElement month : months) {
			if (month.getText().equals("Jan"))
				month.click();
		}

		WebElement years = driver.findElement(By.xpath("xpath Xpression"));

		Select year = new Select(years);
		year.selectByIndex(1);

		WebElement days = driver.findElement(By.xpath("xpath xpression"));
		Select day = new Select(days);
		day.selectByValue("");
		day.selectByVisibleText("Monday");

		// Random Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(0,220)");

		// Scrolling upto Particular Element

		WebElement scrollele = driver.findElement(By.xpath("xpath xpression"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", scrollele);

		// Window ID

		String winId = driver.getWindowHandle();
		System.out.println(winId);

		// WindowID's

		Set<String> winids = driver.getWindowHandles();
		System.out.println(winids);

		// Action class is used to perform mouse and keyboard action

		WebElement moveToElement = driver.findElement(By.xpath("xpath xpression"));
		Actions mousehover = new Actions(driver);
		mousehover.moveToElement(moveToElement).perform();

		// Right Click
		WebElement rightClickele = driver.findElement(By.xpath("xpath xpression"));
		Actions rightclick = new Actions(driver);
		rightclick.contextClick(rightClickele).build().perform();

		// Double Click
		WebElement doubleclickele = driver.findElement(By.xpath("xpath xpression"));
		Actions doubleclick = new Actions(driver);
		doubleclick.doubleClick(doubleclickele).build().perform();

		// Drag and Drop
		WebElement drag = driver.findElement(By.xpath("xpath xpression"));
		WebElement drop = driver.findElement(By.xpath("xpath xpression"));

		Actions drgdrop = new Actions(driver);
		drgdrop.dragAndDrop(drag, drop).build().perform();

		// Simple Alert Handling
		driver.switchTo().alert();
		// Confirmation Handling
		driver.switchTo().alert().dismiss();

		// Frame handling

		WebElement frame = driver.findElement(By.xpath("xpath xpression"));
		driver.switchTo().frame(frame);

		// TakesScreenShot Utility of page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("Screenshot file location");
		FileHandler.copy(source, destination);

		// TakesScreenShot of Element

		WebElement ss = driver.findElement(By.xpath(""));
		File sources = ss.getScreenshotAs(OutputType.FILE);
		File destinations = new File("location of File");
		FileHandler.copy(source, destination);

		// Waits in selenium
		// Implicit wait --> this wait allows web driver to wait certain amount of time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit wait-->this waits allows webdirver to wait certain condition
		WebElement element = driver.findElement(By.xpath("xpath xpression"));
		WebDriverWait wait = new WebDriverWait();
		

		// Fluent Wait

	}
}

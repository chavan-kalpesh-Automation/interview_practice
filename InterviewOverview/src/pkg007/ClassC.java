package pkg007;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassC {

	public static void browserlaunching() {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Chrome Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}

	public static void dropdownHandeling1() {
		// using findElements method
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.amazon.in");
		driver.manage().window().maximize();

		List<WebElement> dropdwn = driver.findElements(By.xpath("xpath xpresion"));
		for (WebElement dropdown : dropdwn) {
			if (dropdown.getText().equals("kalpesh"))
				;
			dropdown.click();
		}
		driver.close();

	}

	public static void dropdownHandeling2() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.samplewebsite.com");
		driver.manage().window().maximize();

		// dropdown using select class
		WebElement locationdropdown = driver.findElement(By.xpath("xpath xpression of location locator"));

		Select dropdwn = new Select(locationdropdown);
		dropdwn.selectByIndex(2);
		dropdwn.selectByValue("Pune");
		dropdwn.selectByVisibleText("pune");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();

	}

	public static void scrollingRandom() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.youtube.com");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(0,220)");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.close();

	}

	public static void scrollingElement() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");

		WebElement uptoElement = driver.findElement(By.xpath("xpath xpression"));
		JavascriptExecutor jscript = (JavascriptExecutor) driver;
		jscript.executeScript("arguments[0].scrollIntoView();", uptoElement);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.close();

	}

	public static void windowHandle() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");

		String winID = driver.getWindowHandle();
		System.out.println(winID);
	}

	public static void windowHandles() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("www.google.com");
		driver.manage().window().maximize();

		driver.get("www.youtube.com");

		Set<String> winIDs = driver.getWindowHandles();
		for (String windowIDs : winIDs) {

		}

	}

	public static void mouseActions() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.samplewebsite.com");

		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		// doubleClick
		WebElement doubleclk = driver.findElement(By.xpath("xpath xpression"));
		act.doubleClick(doubleclk).build().perform();

		// RightClick
		WebElement rightclk = driver.findElement(By.xpath("xpath xpression"));
		act.contextClick(rightclk).build().perform();

		// Drag & Drop

		WebElement drag = driver.findElement(By.xpath("xpath xpression"));
		WebElement drop = driver.findElement(By.xpath("xpath xpression"));

		act.dragAndDrop(drag, drop).build().perform();

	}

	public static void simpleAlert() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();

		WebElement alert = driver.findElement(By.xpath("xpath xpression"));
		alert.click();

		driver.switchTo().alert().dismiss();

	}

	public static void confirmationAlert() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();

		WebElement alertele = driver.findElement(By.xpath("xpath xpression"));
		alertele.click();

		driver.switchTo().alert().accept();

		driver.switchTo().alert().dismiss();

	}

	public static void iframeHandeling() {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.sampleurl.com");
		driver.manage().window().maximize();

		driver.switchTo().frame(1);
		driver.switchTo().frame("iframe");

	}

	public static void screenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("location of file where we have save screenshot of file	");
		FileHandler.copy(source, destination);

	}

	public static void portionScreenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();

		WebElement ss = driver.findElement(By.xpath("xpath xpression"));
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("location of file where we have to save screenshot file");
		FileHandler.copy(source, destination);

	}

	public static void waits() {
		// implicit waits
		System.setProperty("webdriver.chrome.driver", "driver location	");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Explicit waits
		WebElement waitele = driver.findElement(By.xpath("xpath xpression"));
		WebDriverWait wait = new WebDriverWait(driver, 19);
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath xpression"))).click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("xpath xpression")));

		// Fluent Waits
		WebElement waitelement = driver.findElement(By.xpath("xpath xpression"));
		FluentWait wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

	}

	public static void main(String[] args) {

	}
}

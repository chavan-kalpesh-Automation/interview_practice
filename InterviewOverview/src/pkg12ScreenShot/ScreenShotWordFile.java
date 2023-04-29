package pkg12ScreenShot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotWordFile {

	public static void captureScreenshot() throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		// Take screenshot using Selenium's TakesScreenshot interface
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);

		// Create a new Word document
		XWPFDocument document = new XWPFDocument();

		// Add a new paragraph to the document
		XWPFParagraph paragraph = document.createParagraph();

		// Add a new run to the paragraph
		XWPFRun run = paragraph.createRun();

		FileInputStream fis = new FileInputStream(source);

		// Add screenshot to the Word document

		run.addPicture(fis, XWPFDocument.PICTURE_TYPE_JPEG, "screenshot.jpeg", Units.toEMU(500), Units.toEMU(500));

		fis.close();

		// Save the Word document
		FileOutputStream out = new FileOutputStream(new File("F:\\SCreenShot Files\\DocumentScreenshot.docx"));
		document.write(out);
		out.close();
		document.close();
		System.out.println("run successfully ");

	}

	public static void main(String[] args) throws Exception {
		captureScreenshot();
	}
}

package pkg12ScreenShot;

import java.io.IOException;



public class MultipleScreenshot1 extends ScreenShotUtility {

	public static void main(String[] args) throws IOException, InterruptedException {

		initialization();// browser launch

		passtestcasess(); // 1st screenshot

		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		failtestcase();

	}

}

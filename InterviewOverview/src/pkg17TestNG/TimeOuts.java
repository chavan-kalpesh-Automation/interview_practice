package pkg17TestNG;

import org.testng.annotations.Test;

public class TimeOuts {

	@Test(timeOut = 3000)
	public void TestCase1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test Case 1");
	}

	@Test(dependsOnMethods = "TestCase1")
	private void TestCase2() {
		System.out.println("Test Case 2");

	}

}

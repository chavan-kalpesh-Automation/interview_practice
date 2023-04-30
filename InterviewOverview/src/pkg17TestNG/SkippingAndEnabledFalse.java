package pkg17TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkippingAndEnabledFalse {
	// Skipping
	// Enabled =false

	@Test
	public void TestCase1() {
		System.out.println("Test Case 01");
		Assert.assertEquals(false, true);

	}

	@Test(dependsOnMethods = "TestCase1")
	public void TestCase2() {
		System.out.println("Test Case 02");
	}

	@Test
	public void TestCase3() {
		System.out.println("Test Case 03");
	}

}

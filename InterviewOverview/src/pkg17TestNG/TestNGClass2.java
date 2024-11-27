package pkg17TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGClass2 {

	@Test(priority = 2, invocationCount = 3, enabled = true)
	public void test() {
		System.out.println("Test Case 00");

	}

	@Test(priority = 0, dependsOnMethods = "method2", alwaysRun = true)
	public void test1() {
		System.out.println("Test Case o1 --Depends On Method");

	}

	@Test(priority = 1, description = "Description about Test")
	public void method2() {
		System.out.println("Method 002");
		Assert.assertEquals(true, true);
		System.out.println("Method 002 Assertion Failed ");

	}
}

package pkg17TestNG;

import org.testng.annotations.Test;

public class TestNGGroups2 {
	@Test
	public void TestCase21() {
		System.out.println("Class 2 Test Case 21");
	}

	@Test(groups="regression")
	public void TestCase22() {
		System.out.println("Class 2 Test Case 22");
	}

	@Test
	public void TestCase23() {
		System.out.println("Class 2  Test Case 23");
	}

	@Test(groups="regression")
	public void TestCase24() {
		System.out.println("Class 2 Test Case 24");
	}
	@Test 
	public void TestCase25() {
		System.out.println("Class 2 Test Case 25");
	}
}

package pkg17TestNG;

import org.testng.annotations.Test;

public class TestNGGroups {
	@Test(groups="regression")
	public void TestCase1() {
		System.out.println("Test Case 1");
	}

	@Test
	public void TestCase2() {
		System.out.println("Test Case 2");
	}

	@Test(groups="regression")
	public void TestCase3() {
		System.out.println("Test Case 3");
	}

	@Test
	public void TestCase4() {
		System.out.println("Test Case 4");
	}
	@Test (groups="regression")
	public void TestCase5() {
		System.out.println("Test Case 5");
	}
}

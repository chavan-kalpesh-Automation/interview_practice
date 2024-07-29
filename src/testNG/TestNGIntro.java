package testNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//TestNG Test Execution
//1) Alphabetically 
//2)on priority basics
//3)same priority then alphabetically
//4)

public class TestNGIntro {

	@Test
	public void test() {
		System.out.println("TestNG Test");
	}

//how to pass parameter in testNG test 
	@Test
	@Parameters({ "username", "password" })
	public void loginMethod(String username, String password) {
		// this parameter will be pass in xml file
		//and class run through also .xml file 
		System.out.println("For Login Username is "+username+" password is "+password);
		System.out.println("login sucess ");
	}

	@Test(priority = 5)
	public void TestCase() {
		Reporter.log("checking log message given in Reporter class log method ", false);
		System.out.println("Test Case 1");
	}

	@Test(priority = 5, invocationCount = 2)
	public void TestCase2() {
		System.out.println("Test Case 2");
	}

	@Test(priority = 5)
	public void TestCase3() {
		System.out.println("Test Case 3");
	}

	@Test(priority = 0)
	public void TestCase4() {
		System.out.println("Test Case 4");
	}

	@Test(priority = -5, enabled = true, alwaysRun = true)
	public void TestCase5() {
		System.out.println("Test Case 5");

	}
}

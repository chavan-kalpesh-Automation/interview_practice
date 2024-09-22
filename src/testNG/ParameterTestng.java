package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestng {
@Test
@Parameters("myName")
public void paramerterizedTest(String myName){
	System.out.println(myName);
}

}

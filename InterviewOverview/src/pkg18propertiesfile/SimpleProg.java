package pkg18propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SimpleProg {
	public static Properties prop;
public static FileInputStream ipFile;
	public static void main(String[] args) throws FileNotFoundException {
		prop = new Properties();
	 ipFile = new FileInputStream(
				"C:\\Users\\VISHAL\\git\\InterviewOverview\\InterviewOverview\\Config.properties");

		

	}
}

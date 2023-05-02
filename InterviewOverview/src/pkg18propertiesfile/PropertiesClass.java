package pkg18propertiesfile;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static Properties prop;

	public PropertiesClass() throws IOException {
		prop = new Properties();
		FileInputStream ipfile = new FileInputStream(
				"C:\\Users\\VISHAL\\git\\InterviewOverview\\InterviewOverview\\Config.properties");
		prop.load(ipfile);
	}
}

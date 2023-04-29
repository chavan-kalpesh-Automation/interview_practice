package pkg18propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Properties file data fetching 
//"C:\Users\VISHAL\git\InterviewOverview\InterviewOverview\Config.properties"

public class PropertiesFileRead {
	public static Properties prop;

	public static void property() {
		try {
		prop = new Properties();
		FileInputStream ipFile = new FileInputStream(
				"C:\\Users\\VISHAL\\git\\InterviewOverview\\InterviewOverview\\Config.properties");
		prop.load(ipFile);
		}
		
		catch(FileNotFoundException  e) {
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	
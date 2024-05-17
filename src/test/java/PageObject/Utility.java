package PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public Properties prop;
	
	public String configProperties(String label) throws IOException {
		
		prop = new Properties();
		//FileInputStream ip = new FileInputStream(("C:\\Users\\vijay\\eclipse-workspace2\\atfBDD\\config.properties"));
		FileInputStream ip = new FileInputStream(("./config.properties"));
		prop.load(ip);
		String label_Value = prop.getProperty(label);
		return label_Value;
	}

}

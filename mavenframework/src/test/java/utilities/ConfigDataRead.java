package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataRead  {
	Properties prop;
	public ConfigDataRead() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\configs.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String getUserId() {
		String uid = prop.getProperty("userid");
       return uid;
       
	}

	public String getPass() {
		String pass= prop.getProperty("pass");
		 return pass;
	}

	public String getURL() {
		String url= prop.getProperty("url");
		 return url;
	}
	public String homePageurl() {
		String homePageurl=prop.getProperty("homepage");
		return homePageurl;
		
	}
	public String zerodhaUrl() {
		String loginPageurl=prop.getProperty("zerodhaurl");
		return loginPageurl;
		
	}
	
		
	}
	
	



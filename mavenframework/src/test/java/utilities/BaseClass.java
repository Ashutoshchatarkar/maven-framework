package utilities;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends ConfigDataRead  {
public static	ConfigDataRead config;
public static WebDriver driver;
public static WebDriverWait wait;
public static Properties prop;
public static String id;
public static String url;
public static String pass;
public static String homePage;
public static String zerodhaUrl;
@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })

public void loadConfig() {
	System.out.println("in before suit");
	config=new ConfigDataRead();
	id = config.getUserId();
	System.out.println(id);
	 url=config.getURL();
	 System.out.println(url);
	 pass=config.getPass();
	 System.out.println(pass);
	 homePage=config.homePageurl();
	 zerodhaUrl = config.zerodhaUrl();
	ExtentReportClass.setExtent();
	DOMConfigurator.configure("log4j.xml");

}
@BeforeClass
public void setup() {
	
WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.get(zerodhaUrl);
	wait=new WebDriverWait(driver, 50);
}


@AfterClass
public void tearDown() {
	
	driver.quit();
	
}
}

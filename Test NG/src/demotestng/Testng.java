package demotestng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
         WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\java workspace\\Test NG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		
	}

	@Test(priority = 1)
	
	public void verifypagetitletest() {
		String title = driver.getTitle();
		System.out.println("the page title is:" + title);
		Assert.assertEquals("My Store", title);

	}

	@Test(priority = 2)
	public void createAnaccount() {
		WebElement searchbox = driver.findElement(By.className("login"));
		searchbox.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']")); //// *[@id="email_create"]
		email.sendKeys("ashutoshchatarkr264@gmail.com");
		email.click();


	

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
	
	
}

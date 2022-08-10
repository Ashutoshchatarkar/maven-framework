package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;
import utilities.ConfigDataRead;

public class ZerodhaLoginPage extends BaseClass {
	ConfigDataRead config = new ConfigDataRead();
	private By userId =By.xpath(getPass());
			

	public ZerodhaLoginPage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
}

}

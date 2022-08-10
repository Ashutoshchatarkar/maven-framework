package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import actions.Actionsclass;
import utilities.BaseClass;
import utilities.ConfigDataRead;

public class LoginPage extends BaseClass {
	ConfigDataRead config = new ConfigDataRead();
	private By userId = By.id("txtUsername");
	private By imgLogo = By.xpath("//div[@id=\"divLogo\"]/img");
	private By password = By.id("txtPassword");
	private By loginBtn = By.id("btnLogin");
	private By errorMsg = By.xpath("//span[@id='spanMessage']");
	private By forgotPass = By.xpath("//div[@id=\"forgotPasswordLink\"]/a");
	private By linkedInLink = By.xpath("//div[@id=\"social-icons\"]/a[1]");
	private By facebookLink = By.xpath("//div[@id=\"social-icons\"]/a[2]");
	private By twitterLink = By.xpath("//div[@id=\"social-icons\"]/a[3]");
	private By youtubeLink = By.xpath("//div[@id=\"social-icons\"]/a[4]");
	private By logout = By.xpath("//a[normalize-space()='Logout']");
	private By welcomeDropdown = By.xpath("//a[@id='welcome']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getErrorMsg() {
		String error = driver.findElement(errorMsg).getText();
		return error;
	}

	public void getUId() {
		WebElement userid= driver.findElement(userId);
		Actionsclass.sendKeys(driver, userid, 30, id);
	}

	public void getImgLogo() {
		driver.findElement(imgLogo).click();
	}

	public void getPassword() {
	
		WebElement pwd =driver.findElement(password);
		Actionsclass.sendKeys(driver, pwd, 30, pass);
	}

	public void getLoginBtn() {
		driver.findElement(loginBtn).click();
	}

	public void getForgotPass() {
		driver.findElement(forgotPass).click();
	}

	public void getLinkedInLink() {
		driver.findElement(linkedInLink).click();
	}

	public void getFacebookLink() {
		driver.findElement(facebookLink).click();
	}

	public void getTwitterLink() {
		driver.findElement(twitterLink).click();
	}

	public void getYoutubeLink() {
		driver.findElement(youtubeLink).click();
	}

	public void getLogoutBtn() {
		driver.findElement(logout).click();
	}

	public void login() {
		getUId();
		getPassword();
		getLoginBtn();
	}

	public void logout() {
		getDropDown();
		getLogoutBtn();
	}

	public void getDropDown() {
		driver.findElement(welcomeDropdown).click();
	}

}
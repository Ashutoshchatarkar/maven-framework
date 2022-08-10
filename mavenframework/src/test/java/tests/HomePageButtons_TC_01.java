package tests;


import org.testng.annotations.Test;

import actions.Actionsclass;
import pages.LoginPage;
import utilities.BaseClass;

public class HomePageButtons_TC_01 extends BaseClass {
	LoginPage login = new LoginPage(driver);
	Actionsclass action = new Actionsclass();

	@Test(priority = 1)
	public void login_TC_01() throws InterruptedException {
		System.out.println(url);
		login.login();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		if (getURL().equals(driver.getPageSource())) {
			System.out.println(login.getErrorMsg());
		}
		login.logout();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void verifySocialIcons_TC_02() throws InterruptedException {
		login.getLinkedInLink();
		Thread.sleep(5000);

		action.getParentWindow();
		Thread.sleep(2000);
		login.getFacebookLink();
		Thread.sleep(5000);
		action.getParentWindow();
		Thread.sleep(2000);
		login.getTwitterLink();
		Thread.sleep(5000);
		action.getParentWindow();
		Thread.sleep(2000);
		login.getYoutubeLink();
		Thread.sleep(5000);
		action.getParentWindow();
	}

	@Test(priority = 3)
	public void verifyLink_TC_03() throws InterruptedException {

		String homePage=config.homePageurl();
		
		action.brokenLinks(homePage);

	}
}


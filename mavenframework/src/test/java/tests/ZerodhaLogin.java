package tests;

import org.testng.annotations.Test;

import actions.Actionsclass;
import utilities.BaseClass;

public class ZerodhaLogin extends BaseClass{
	@Test
	public void zerodhLinkverify() throws InterruptedException {
		Actionsclass links = new Actionsclass();
		
		links.brokenLinks(zerodhaUrl);
		
		
		
	}

}

package amarr.loginpagetests;

import org.testng.annotations.Test;

import amarr.pageevents.HomePageEvents;
import amarr.pageevents.LoginPageEvents;
import amarr.testbase.BaseTests;

public class LoginPageTests extends BaseTests {

	@Test(testName = "login with an invalid credential")
	public void tc_3() {
		HomePageEvents home = new HomePageEvents();
		home.clickRejectCookies();
		LoginPageEvents login = home.clickOnIAmADealer();
		login.enterEmailId("abc@nomail.com");
		login.clickOnContinue();
	}

}

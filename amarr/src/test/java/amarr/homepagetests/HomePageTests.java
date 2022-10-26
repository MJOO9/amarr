package amarr.homepagetests;

import org.testng.annotations.Test;

import amarr.core.ElementFetcher;
import amarr.pageevents.HomePageEvents;
import amarr.pageevents.LoginPageEvents;
import amarr.testbase.BaseTests;

public class HomePageTests extends BaseTests {

	ElementFetcher fetcher= new ElementFetcher();
	
	
	@Test(testName = "Amarr Logo verification tests")
	public void tc_1() {
		
		HomePageEvents home=new HomePageEvents();
		
		home.clickRejectCookies();
		boolean isPresent=home.amarrLogoVerification();
		
		fetcher.verify(isPresent, true, "Logo is present");
	}
	
	
	@Test(testName = "Login with valid id ")
	public void tc_2() {
		
	//TO DO
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
}

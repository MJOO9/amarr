package amarr.pageevents;

import amarr.core.ElementFetcher;
import amarr.pagelements.HomePageElements;

public class HomePageEvents implements HomePageElements{
	
	ElementFetcher fetcher= new ElementFetcher();
	public void clickRejectCookies() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fetcher.getWebElement("id", rejectCookiesID).click();
	}
	public void clickAcceptCookies() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fetcher.getWebElement("id", acceptCookiesID).click();
	}
	
	public LoginPageEvents clickOnIAmADealer() {
		fetcher.getWebElement("xpath", iAmADealerXpath).click();
		return new LoginPageEvents();
	}
	public boolean amarrLogoVerification() {
	 return	fetcher.doesElementExists("xpath", amarrLogoXpath);
	}
}

package amarr.pageevents;

import amarr.core.ElementFetcher;
import amarr.pagelements.LoginPageElements;

public class LoginPageEvents implements LoginPageElements{

	ElementFetcher fetcher=new ElementFetcher();
	
	
	public void enterEmailId(String email) {
		fetcher.getWebElement("id", emailUserID).sendKeys(email);
	}
	
	
	public void clickOnContinue() {
		fetcher.getWebElement("xpath", continueXpath).click();;
	}
}

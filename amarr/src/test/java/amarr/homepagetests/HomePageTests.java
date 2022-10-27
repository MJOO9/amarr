package amarr.homepagetests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import amarr.core.ElementFetcher;
import amarr.pageevents.HomePageEvents;
import amarr.pageevents.LoginPageEvents;
import amarr.testbase.BaseTests;

public class HomePageTests extends BaseTests {

	ElementFetcher fetcher= new ElementFetcher();
	
	
	@Test(enabled= true,  testName = "Amarr Logo and url verification tests")
	public void TC_1() {
		
		HomePageEvents home=new HomePageEvents();
		
		home.clickRejectCookies();
		boolean isPresent=home.amarrLogoVerification();
		
		fetcher.verify(isPresent, true, "Logo is present");
	 System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}
	
	
	@Test(enabled= true, testName = " Verify UI for HomePage ")
	public void TC_2() {
	
     HomePageEvents home=new HomePageEvents();
		
        home.clickAcceptCookies();
		home.garageDoorsLinkVerify();
		home.commercialDoorsLinkVerify();
		home.designGarageDoorLinkVerify();
		home.whereToBuyLinkVerify();
		home.supportLinkVerify();
				
		
		
	}
	
	@Test(enabled= true, testName = "Login with valid id ")
	public void TC_3() {
	
     HomePageEvents home=new HomePageEvents();
		
		home.clickAcceptCookies();
		LoginPageEvents login = home.clickOnIAmADealer();
		login.enterEmailId("salmankarim@assaabloy.com");
		login.clickOnContinue();
		System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
		
	}
	
		
	
	@Test(enabled= true, testName = "login with an invalid credential")
	public void TC_4() {
		HomePageEvents home = new HomePageEvents();
		home.clickRejectCookies();
		LoginPageEvents login = home.clickOnIAmADealer();
		login.enterEmailId("abc@nomail.com");
		login.clickOnContinue();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.id("password")).sendKeys("XYZ@123");
		driver.findElement(By.xpath("//button[@name='action']")).click();
		if(driver.getPageSource().contains("Wrong email or password"))
		{System.out.println("Wrong email or password");}
		else {System.out.println("Text not present");}
	}

	
	
}

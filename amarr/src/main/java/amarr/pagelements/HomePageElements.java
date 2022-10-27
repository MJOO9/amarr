package amarr.pagelements;

public interface HomePageElements {
/**
 * Below list of all HomePage element XPATH listed, please list more if required
 */
	String amarrLogoXpath = "//img[@loading='lazy' and @alt='Amarr Garage Doors']";
	String iAmADealerXpath = "//a[@class='body-text3'][contains(text(),'I’m a dealer')]";
	String garageDoorXpath = "//a[contains(text(),'Garage Doors')]";
	String commercialDoorXpath = "//a[contains(text(),'Commercial Doors')]";
	String whereToBuyXpath="//a[contains(text(),'Where to Buy')]";
	String designYourGarageDoorXpath="//a[contains(text(),'Design Your Garage Door')]";
    String supportXpath="//li/a[text()='Support' and @class='nav-link amarr-h6']";
    
    /**
     * Below list of all id element for home page please list more if required
     */
    String manageCookiesID="onetrust-pc-btn-handler";
    String acceptCookiesID="onetrust-accept-btn-handler";
    
    String rejectCookiesID="onetrust-reject-all-handler";
    
    
}

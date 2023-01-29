package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.ls.LSOutput;

public class DynamicXpath {
	
	//Creating xpath by id
	@FindBy(xpath = "//input[@id='globalSearchInputField']")
	WebElement searchEngin01;
	
	@FindBy(id = "registry-link")
	WebElement registryLink02;
	
	@FindBy(xpath = "//input[@id='globalSearchInputField']")
	WebElement searchButton;
	
	@FindBy(xpath = "//a[@id='forgot-password']")
	WebElement forgotYourPassword;
	
	@FindBy(id = "show-pw")
	WebElement showPw;
	
	
	
	
	
	//creating xpath by class
	@FindBy(xpath = "//a[@class='header-logo__image']")
	WebElement logo;
	
	@FindBy(xpath = "//span[@class='store-info-name']")
	WebElement shopYourStore;
	
	@FindBy(xpath = "(//li[@class='title'])[1]")
	WebElement macysCreditCard;
	
	@FindBy(className = "starIcon")
	WebElement StarRewards;
	
	@FindBy(className = "result-category-name h3")
	WebElement sale;
	
	
	
	
	//creating xpath by name
	@FindBy(xpath = "//input[@name='keyword']")
	WebElement searchEngin02;
	
	
	
	
	//creating xpath by text
	@FindBy(xpath = "//span[text()='Sign In']")
	WebElement signinButton;
	
	@FindBy(xpath = "//label[text()='Password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//a[text()='Klarna']")
	WebElement customerServiceKlarna;
	
	@FindBy(xpath = "//span[text()='Star Rewards signup']")
	WebElement starRewardsSignup;
	
	@FindBy(xpath = "(//a[text()='Help Center'])[1]")
	WebElement macysHelpCenter;
	
	
	
	
	
	
	
	
	
	//Creating xpath by partial text
	@FindBy(xpath = "(//a[contains(text(), 'Wedding Re')])[1]")
	WebElement weedingregistry01;
	
	
	
	
	
	//Creating xpath by using and logic
	@FindBy(xpath = "//a[text()= 'Wedding Registry' and @id='registry-link']")
	WebElement weedingregistry02;
	
	
	
	
	
	
	
	
	
	
	//Creating xpath by using or logic
	
	
	
	//input[name='keyword']---------creating css selector by name. 
	
	//input#globalSearchInputField-------------creating css selector by id
	
	//input.globalSearchInputField.right---------creating css selector by class

}

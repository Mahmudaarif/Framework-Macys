gitpackage testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

////import org.testng.asserts.SoftAssert;

import baseUtil.BaseClass;
//import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;
import org.openqa.selenium.Dimension;

public class HomePageTest extends BaseClass {

	
	
	Select select;
	Actions actions;
	Dimension dimension;

	@Test(enabled = false)
	public void clickLogoElement01Test() {
		homePage.clickLogoElement01();

	}

	// @Test(enabled = false)
	// *public void sendKeysInSearchengineTest() throws InterruptedException {ogo
	// homePagge.sendKeysInSearchengine01();
	// }

	@Test(enabled = false)
	public void clickSignInButtonTest() throws InterruptedException {
		homePage.clickSignInButton();
	}

	@Test(enabled = false)
	public void sendKeysInSearchengine02Test() throws InterruptedException {
		homePage.sendKeysInSearchengine02();
	}

//(Home work number3)**************

	@Test(enabled = false)
	public void use_of_isDisplayed_in_logo_image() throws InterruptedException {
		boolean elementDisplayed = driver.findElement(By.cssSelector(".header-logo__image")).isDisplayed();
		System.out.println("Is the text displayed? ans:" + elementDisplayed);

	}

	@Test(enabled = false)
	public void use_of_isEnabled_in_signin_button() throws InterruptedException {
		boolean elementIsEnabled = driver.findElement(By.xpath("//span[text()='Sign In']")).isEnabled();
		System.out.println("Is signin button enabled? ans:" + elementIsEnabled);

	}

	@Test(enabled = false)
	public void use_of_isSelected_method_in_signin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(3000);
		boolean isSelected = driver.findElement(By.cssSelector("input#stay-signedin")).isSelected();
		System.out.println(isSelected);
	}

	@Test(enabled = false)
	public void use_of_getTitle_and_getCurrentUrl_method_in_signin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

	@Test(enabled = false)
	public void use_of_getAttribute_method_in_signin() throws InterruptedException {
		String a = driver.findElement(By.id("registry-link")).getAttribute("id");
		System.out.println("Attribute: " + a);

	}

	@Test(enabled = false)
	public void use_of_clear_method_in_searchEngine() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("shoe");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).clear();
		Thread.sleep(5000);

	}

// 	************(Home work 4 )****************

	@Test(enabled = false)
	public void use_of_enter_method_in_searchEngine() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("shoe", Keys.ENTER);
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void use_of_return_method_in_searchEngine() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("shoe", Keys.RETURN);
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void useOfNavigateMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www2.hm.com/en_us/index.html");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

	// ***********(H0mework5)*****************

	@Test(enabled = false)
	public void dropDownByIndex() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		Thread.sleep(4000);
		WebElement selectElement = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		// select = new Select(driver.findElement(By.xpath("//select[@id='sortBy']")));
		select = new Select(selectElement);
		select.selectByIndex(1);
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void dropDownByValue() throws InterruptedException {
		driver.get("https://www.ebay.com/");

		Thread.sleep(4000);
		WebElement selectElement = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		// select = new Select(driver.findElement(By.xpath("//select[@id='sortBy']")));
		select = new Select(selectElement);
		select.selectByValue("0");
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void dropDownByVisibleText() throws InterruptedException {
		driver.get("https://www.ebay.com/");

		Thread.sleep(4000);
		WebElement selectElement = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		// select = new Select(driver.findElement(By.xpath("//select[@id='sortBy']")))
		select = new Select(selectElement);
		select.selectByVisibleText("All Categories");
		Thread.sleep(4000);

	}

	// using of mouse hover over action
	@Test(enabled = false)
	public void useofHoverAction01() throws InterruptedException {
		driver.get("https://www.costco.com/");
		// To do the mouse hover action, we use Actions class
		actions = new Actions(driver);
		WebElement Deals = driver.findElement(By.xpath("//a[@id='Home_Ancillary_2']"));
		Thread.sleep(3000);
		actions.moveToElement(Deals).build().perform();// this syntax interview question
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void useOfHoverAction02() throws InterruptedException {
		driver.get("https://www.costco.com/");
		actions = new Actions(driver);
		WebElement Grocery = driver
				.findElement(By.xpath("//a[@class='grocery nav-flyout' and @id='Home_Ancillary_0']"));
		Thread.sleep(4000);
		actions.moveToElement(Grocery).build().perform();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_set_specific_size_in_window() throws InterruptedException {

		Thread.sleep(3000);
		dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(3000);
		System.out.println("Size of the set screen: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Size of the maximize screen: " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		System.out.println("Size of the set screen: " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		System.out.println("Size of the Fullscreen: " + driver.manage().window().getSize());

	}

	@Test(enabled = false)
	public void useOfHardAssert01() {
		driver.get("https://www.costco.com/");
		WebElement logo = driver.findElement(By.cssSelector("img.bc-logo.logo-us"));
		boolean logoDisplayed = logo.isDisplayed();
		System.out.println("Is logo displayed: " + logoDisplayed);
		Assert.assertTrue(true, "Logo is not displayed");
	}

	@Test(enabled = false)
	public void useOfHardAssert02() throws InterruptedException {
		driver.get("https://www.costco.com/");
		String expected = "Welcome to Costco Wholesale";
		String actual = driver.getTitle();
		System.out.println("Actual title: " + actual);
		Assert.assertEquals(actual, expected, "Title does not match");
		Thread.sleep(3000);

	}

	// First part of the test case will fail. Since I am using hard assertion, then
	// the execution will stop too.

	// ***********(Home work6)*************

	@Test(enabled = false)
	public void Use_of_loggerTest01() throws InterruptedException {
		homePage.clickSignInButton();
	}

	@Test(enabled = false)
	public void Use_of_loggerTest02() throws InterruptedException {
		homePage.clickSignInButton();

	}

	@Test(enabled = false)
	public void click_by_javascriptExecutor() throws InterruptedException {
		WebElement singninButton = driver
				.findElement(By.cssSelector("button.SiteHeader__submenu-toggle.a._hover-underline"));
		js.executeScript("arguments[0].click()", singninButton);
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void inputText_by_javascriptExecutor() throws InterruptedException {
		WebElement singninButton = driver
				.findElement(By.cssSelector("button.SiteHeader__submenu-toggle.a._hover-underline"));
		js.executeScript("arguments[0].click()", singninButton);
		Thread.sleep(4000);
		WebElement userid = driver.findElement(By.cssSelector("input#uid_56"));
		WebElement password = driver.findElement(By.cssSelector("input#uid_61"));
		js.executeScript("arguments[0].value='Mahmuda'", userid);
		Thread.sleep(4000);
		js.executeScript("arguments[0].value='1234'", password);
		Thread.sleep(4000);
		WebElement checkbox = driver.findElement(By.cssSelector("span.Selection__control._checkbox"));
		js.executeScript("arguments[0].click()", checkbox);
		Thread.sleep(4000);
		Assert.assertTrue(true, "Webelement not found");
		WebElement signinButton2 = driver.findElement(By.className("LoadingButton__content"));
		js.executeScript("arguments[0].click()", signinButton2);
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void handleing_hidden_element() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://enthrallit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link' and text()='Selenium']")).click();
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector("button#formButton3")).sendKeys("Mahmuda",
		// Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Hide / Show' and @id='formButton3']")).click();
		Thread.sleep(3000);
		WebElement hideElement1 = driver.findElement(By.xpath("//button[text()='Hide / Show' and @id='formButton3']"));
		js.executeScript("arguments[0].value='Mahmuda'", hideElement1);
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void use_of_scroll_down_and_scroll_up_by_actions_class() throws InterruptedException {
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_scroll_down_and_scroll_up_by_javascriptExecutor() throws InterruptedException {
		js.executeScript("window.scrollBy(0, 2500)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -1500)", "");
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_explicitly_wait() throws InterruptedException {
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[normalize-space(text())='Start a New Quote']"))).click();
		Thread.sleep(4000);
	}

	@Test(enabled = true)
	public void use_of_explicitly_wait02() throws InterruptedException {
		WebElement startAquote = driver.findElement(By.xpath("//button[normalize-space(text())='Start a New Quote']"));
		wait.until(ExpectedConditions.visibilityOf(startAquote)).click();
		Thread.sleep(4000);
	}

}

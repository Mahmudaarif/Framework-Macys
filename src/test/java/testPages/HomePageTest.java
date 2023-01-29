package testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	private String l;

	@Test(enabled = false)
	public void clickLogoElement01Test() {
		homePagge.clickLogoElement01();

	}

	// @Test(enabled = false)
	// *public void sendKeysInSearchengineTest() throws InterruptedException {ogo
	// homePagge.sendKeysInSearchengine01();
	// }

	@Test(enabled = false)
	public void clickSignInButtonTest() throws InterruptedException {
		homePagge.clickSignInButton();
	}

	@Test(enabled = false)
	public void sendKeysInSearchengine02Test() throws InterruptedException {
		homePagge.sendKeysInSearchengine02();
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

	@Test(enabled = true)
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

}

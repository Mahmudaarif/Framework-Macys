package baseUtil;

/*
 * In your existing framework use the getProperties() and setProperties() methods to locate the chrome driver. From, now onward, You can use all types of locators to find web elements and test for each. For CSS, try to use at least the first 3 ways to create unique web elements.  On the home page, validate the logo and how I validated it. Use isDisplayed(), isEnabled(), isSelected(), getTitle(), getCurrentUrl(), getText(), getAttribute(), clear() method to test. You can also choose more than one URL to see those actions (better). Please push it to GitHub
 */
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePagge;

public class BaseClass {
	public WebDriver driver;
	public HomePagge homePagge;

	@BeforeMethod
	public void setUp() {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\mahmu\\eclipse-workspace\\com.macys\\driver\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com/");

		driver.manage().deleteAllCookies();
		// driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePagge = new HomePagge(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}

}

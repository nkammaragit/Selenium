package webDriverTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitTest {
	public static void main(String args[]) {
		LaunchBrowserClass lb = new LaunchBrowserClass();
		lb.launchApplication("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebDriver driver = lb.driver;
		//==
		// Set up FluentWait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))  // Maximum wait time
				.pollingEvery(Duration.ofSeconds(5))  // Polling interval
				.ignoring(Exception.class);           // Ignore specific exceptions
		// Use FluentWait to find an element
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("email"));
			}
		});
		
		element.sendKeys("myTest");

		//==


		//		WebElement we1 = driver.findElement(By.name("email"));
		//		we1.sendKeys("Test");
	}




}

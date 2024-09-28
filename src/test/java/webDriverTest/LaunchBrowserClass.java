package webDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserClass {
	WebDriver driver = new ChromeDriver();
	public void launchApplication(String url) {
		// open an url
		driver.get(url);
	}

}

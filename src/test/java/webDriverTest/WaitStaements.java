package webDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitStaements {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.opencart.com/");
		//Launch URL
		driver.navigate().to("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();

		
		
		
	}

}

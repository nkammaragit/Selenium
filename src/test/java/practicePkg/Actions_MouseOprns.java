package practicePkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_MouseOprns {

	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
	public static String alertUrl="https://selenium08.blogspot.com/2019/07/alert-test.html";
	public static String cucumIoUrl= "https://cucumber.io/";
	public static String iFrameUrl= "https://selenium08.blogspot.com/2019/11/selenium-iframe.html";
	public static String dragAndDropUrl= "https://jqueryui.com/droppable/";
	public static String mouseHoverUrl= "https://github.com/";
	
	//Launch Browser
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		    //Maximize Browser
			driver.manage().window().maximize();
			//Launch Url
			driver.get(mouseHoverUrl);
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Actions action = new Actions(driver);
			WebElement btnProduct=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Product')]")));
			action.moveToElement(btnProduct).build().perform();
			action.contextClick(btnProduct).build().perform();
			action.doubleClick(btnProduct).build().perform();
			

}
	
}

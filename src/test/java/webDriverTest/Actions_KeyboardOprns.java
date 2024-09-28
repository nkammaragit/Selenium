package webDriverTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_KeyboardOprns {
	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
	public static String alertUrl="https://selenium08.blogspot.com/2019/07/alert-test.html";
	public static String cucumIoUrl= "https://cucumber.io/";
	public static String iFrameUrl= "https://selenium08.blogspot.com/2019/11/selenium-iframe.html";
	public static String dragAndDropUrl= "https://jqueryui.com/droppable/";
	public static String mouseHoverUrl= "https://github.com/";
	public static String keyboardOprnsUrl= "http://textcompare.com/";
		
	//Launch Browser
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    //Maximize Browser
			driver.manage().window().maximize();
			//Launch Url
			driver.get(keyboardOprnsUrl);
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Actions action = new Actions(driver);
			
//			Keyboard operations
			WebElement edtText1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='frm_compare_1']")));
			WebElement edtText2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='frm_compare_2']")));

			edtText1.sendKeys("QA Automation");
			Thread.sleep(3000);
			action.keyDown(Keys.CONTROL);
			action.sendKeys("a");
			action.keyUp(Keys.CONTROL);
			action.perform();
			Thread.sleep(1000);
			//copy highlighted text
			action.keyDown(Keys.CONTROL);
			action.sendKeys("c");
			action.keyUp(Keys.CONTROL);
			action.perform();
			Thread.sleep(1000);
			
			//Paste copied text
			edtText2.click();
//			action.moveToElement(edtLastName).click();
			action.keyDown(Keys.CONTROL);
			action.sendKeys("v");
			action.keyUp(Keys.CONTROL);
			action.perform();
			
			if(edtText1.getAttribute("value").equals(edtText2.getAttribute("value"))){
				System.out.println("Test passed");
			}
}
	
}

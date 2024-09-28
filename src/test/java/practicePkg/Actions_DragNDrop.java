package practicePkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_DragNDrop {
	
	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
	public static String alertUrl="https://selenium08.blogspot.com/2019/07/alert-test.html";
	public static String cucumIoUrl= "https://cucumber.io/";
	public static String iFrameUrl= "https://selenium08.blogspot.com/2019/11/selenium-iframe.html";
	public static String mouseHoverUrl= "https://github.com/";
	public static String dragAndDropUrl= "https://jqueryui.com/droppable/";

	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to(dragAndDropUrl);
		driver.switchTo().frame(0);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='draggable']")));
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
	}

}

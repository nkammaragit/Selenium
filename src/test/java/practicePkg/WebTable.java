package practicePkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
	public static String alertUrl="https://selenium08.blogspot.com/2019/07/alert-test.html";
	public static String cucumIoUrl= "https://cucumber.io/";
	public static String iFrameUrl= "https://selenium08.blogspot.com/2019/11/selenium-iframe.html";
	public static String dragAndDropUrl= "https://jqueryui.com/droppable/";
	public static String mouseHoverUrl= "https://github.com/";
	public static String webTableUrl= "https://www.w3schools.com/html/html_tables.asp";
	//Launch Browser
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//Maximize Browser
		driver.manage().window().maximize();
		//Launch Url
		driver.get(webTableUrl);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tbl = driver.findElement(By.id("customers"));
		List<WebElement> rows = tbl.findElements(By.tagName("tr"));

		for(int r=0; r<rows.size();r++) {
			List<WebElement> cols = rows.get(r).findElements(By.tagName("td"));
			for(WebElement cell: cols) {
				//					System.out.println(cell.getText());

				if(cell.getText().equals("Island Trading")) {
					//Read country name based on company name
					System.out.println(cols.get(2).getText());
				}
			}
		}}}

package webDriverTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
		public static String webTableUrl= "https://www.w3schools.com/html/html_tables.asp";
			public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.navigate().to(webTableUrl);
			//Create table webelement
			WebElement tbl = driver.findElement(By.id("customers"));
			//Read all rows
			List<WebElement> rows=tbl.findElements(By.tagName("tr"));
			int numOfRows = rows.size();
			for(int r =0; r < numOfRows; r++) {
				//Read all cells of each row
				List<WebElement> cols=rows.get(r).findElements(By.tagName("td"));
				for(WebElement cell : cols) {
					System.out.println(cell.getText());
					if(cell.getText().equals("Centro comercial Moctezuma")) {
						String countryName= cols.get(2).getText();		
						if(countryName.equals("Mexico")) {
							System.out.println("Test passed : " + countryName);
						}
						else {
							System.out.println("Test Failed : " + countryName);
						}
			}}}}}

package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActionRightClick {
	public static void main(String[] args) throws InterruptedException {//mouseactiondoublrclick

       WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		WebElement DoubleClick = driver.findElement(By.xpath("//button[contains(text(),' Me To See Alert')]"));
		    Actions  click2 = new Actions(driver);
		     click2.doubleClick(DoubleClick).build().perform();
		   
		    Thread.sleep(2000);
		   
		    Alert act2 = driver.switchTo().alert();
		     String popup2 = act2.getText();
		     System.out.println(popup2);
		     act2.accept();
		     driver.quit();

		}

		}



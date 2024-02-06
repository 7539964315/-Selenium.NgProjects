package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement rightclickbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
Actions act = new Actions(driver);
act.contextClick(rightclickbutton).build().perform();
driver.findElement(By.xpath("//span[text()='Quit']")).click();
Alert alt = driver.switchTo().alert();
alt.accept();
WebElement doubleclick =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
Actions act1 = new Actions(driver);
act1.doubleClick(doubleclick).build().perform();
Alert alt1 = driver.switchTo().alert();
alt1.accept();
driver.quit();



	}

}

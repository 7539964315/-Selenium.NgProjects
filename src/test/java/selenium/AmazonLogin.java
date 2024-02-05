package selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Thread.sleep(8000);
			/*
			 * WebElement sin =
			 * driver.findElement(By.xpath("//span[contains(text(),'Hello')]")); Actions act
			 * = new Actions(driver); act.moveToElement(sin).build().perform();
			 * driver.findElement(By.xpath("//span[contains(text((),'Sign in')]")).click();
			 * driver.close();
			 */
		 driver.findElement(By.id("twotabsearchtextbox")).click();
		 WebElement srch= driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("iphone 15");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.xpath("//span[text()='iPhone 15 (256 GB) - Black']")).click();
		 ArrayList <String> amazon = new ArrayList<>(driver.getWindowHandles());
		 driver.switchTo().window(amazon.get(1));
		 driver.findElement(By.xpath("//span[text()='Without Exchange']")).click();
		 //driver.close();
		// driver.findElement(By.id("nav_avod_desktop_topnav")).click();
		// driver.close();

		// driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();


	}

}

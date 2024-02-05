package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	  WebDriver driver = new ChromeDriver();

  @Test
  public void f() throws InterruptedException {
	   driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Thread.sleep(8000);
  }
  @Test
  public void f1() {
	  driver.findElement(By.id("twotabsearchtextbox")).click();
		 WebElement srch= driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("iphone 15");
  }
}

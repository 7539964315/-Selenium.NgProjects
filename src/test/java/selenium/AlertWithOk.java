package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertWithOk {
	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");    
		//driver.manage().window().maximize();


		driver.findElement(By.xpath("(//a[contains(text(),'Alert with ')])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();


		Alert h1= driver.switchTo().alert();
		Thread.sleep(2000);

		//String popup =  h1.getText();
		//System.out.println(popup);
		h1.accept();
		driver.close();
		driver.quit();
		}


}

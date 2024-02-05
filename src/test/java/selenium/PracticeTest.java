package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://colab.humanbrain.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@class='collapse navbar-collapse justify-content-center']//a[@class='nav-item nav-link'][contains(text(),'DATA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'HIGHLIGHT')]//following::a[1]")).click();
		//String  gettext = driver.findElement(By.xpath("//h1[contains(text(),'Sudha Gopalakrishnan Brain Centre')]")).getText();
		String  gettext = driver.findElement(By.xpath("//h1[@class='head']")).getText();
		System.out.println(gettext);
	}

}

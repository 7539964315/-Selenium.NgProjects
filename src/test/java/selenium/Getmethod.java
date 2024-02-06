package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		

		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		Thread.sleep(2000);
		driver.findElement(By.id("signin_button")).click();

		String loginpageURL=driver.getCurrentUrl();
		System.out.println(loginpageURL);
		String loginpageHeader= driver.findElement(By.xpath("//h3[contains(text(),'Log')]")).getText();
		System.out.println(loginpageHeader);
		String ForgotLink=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getText();
		System.out.println(ForgotLink);
		String SingInButtonTagname=driver.findElement(By.name("submit")).getTagName();
		System.out.println(SingInButtonTagname);

		String Attributevalue=driver.findElement(By.name("submit")).getAttribute("class");
		System.out.println(Attributevalue);

		String cssvalue=driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(cssvalue);
		driver.quit();

		}






}

package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
	
public static void main(String[] args)
{
//System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/");     //july 30,31= assinments
driver.manage().window().maximize();
//driver.findElement(By.id("details-button")).click();
//driver.findElement(By.id("proceed-link")).click();

driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//input[@id='login-button']")).click();
//javascriptexituter
//driver.findElement(by.id)
driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']")).click();
driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']/following::button[1]")).click();
driver.findElement(By.id("checkout")).click();
driver.findElement(By.id("first-name")).sendKeys("sanjay");
driver.findElement(By.id("last-name")).sendKeys("kumar");
driver.findElement(By.id("postal-code")).sendKeys("600091");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("finish")).click();

//6getmethodsare in below
String PageTitle = driver.getTitle();//to print on consul screen output Swag Labs
System.out.println(PageTitle);

String CurrentPageUrl =driver.getCurrentUrl();
System.out.println(CurrentPageUrl);//https://www.saucedemo.com/checkout-complete.html

String PageText = driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getText();
    System.out.println(PageText);//THANK YOU FOR YOUR ORDER
   
String attribute = driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getAttribute("class");
System.out.println(attribute); //complete-header

String tgname = driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getTagName();
System.out.println(tgname);//h2

            String CssValu =driver.findElement(By.xpath("//img[@class='pony_express']")).getCssValue("font-size");
            System.out.println(CssValu);//  14px

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          //  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
            
}
}



package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation {
	WebDriver driver;
//ExtentReports extentReport;
//ExtentSparkReporter htmlReporter;
//ExtentTest testCase;

	long starttime;
	long endtime;

	@BeforeSuite
	public void launchbrowse() {


		starttime = System.currentTimeMillis();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void a_google() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		if (title.equals(title))
			System.out.println("passed");
		else
			System.out.println("failed");
	}

	@Test
	public void b_bingo() {

		driver.get("https://www.bing.com/");
		System.out.println("bing opened");

	}

	@Test
	public void c_facebook() {

		driver.get("https://www.facebook.com/");
		System.out.println("fb opened");

	}

	@AfterSuite
	public void closebrowse() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);
	}
}

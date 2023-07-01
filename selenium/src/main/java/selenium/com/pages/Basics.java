package selenium.com.pages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// testng is a testing framework for java programming language
// used for unit, integration, end-to-end and functional testing
// inspired by junit and nunit
// new functionality that make it more powerful
// 1. annotations
// 2. parallel testing
// 3. support data driven testing (with @DataProvider) 

// 

public class Basics {
	@Test
	public void TestGoogle() throws InterruptedException {
		// added web driver manager for managing web driver executables
	WebDriverManager.chromedriver().setup();	
	// creating instance for web driver
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/pankajkulsange");
	String fullName = driver.findElement(By.className("vcard-fullname")).getText();
	System.out.println(fullName);
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	driver.quit();
	}
}

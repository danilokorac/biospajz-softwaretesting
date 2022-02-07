package testovi;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;

public class GlavnaStranaTest {

	private WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\El Dante\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void glavnaStranaTest() throws InterruptedException {
		driver.get("https://www.biospajz.rs/");
		driver.manage().window().setSize(new Dimension(1054, 808));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".css-1b2qzhv")).click();
		
		assertEquals(driver.findElement(By.cssSelector(".css-1b2qzhv")).getText(),
				"Dobrodošli u Bio Špajz zdrava hrana.");

	}
}

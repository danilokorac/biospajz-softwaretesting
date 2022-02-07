package testovi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class PretragaTest {

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
	public void pretragaTest() throws InterruptedException {
		driver.get("https://www.biospajz.rs/");
		driver.manage().window().setSize(new Dimension(1051, 806));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".css-s7j65e g > path:nth-child(1)")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("yung99kv@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("tsw2021");
		driver.findElement(By.cssSelector(".css-1seh2f8")).click();
		driver.findElement(By.cssSelector(".css-1ivx1oq")).click();
		driver.findElement(By.cssSelector(".css-1ivx1oq")).sendKeys("ovsena kasa");
		driver.findElement(By.cssSelector(".css-u2ay7i")).click();
		Thread.sleep(5000);
		
		assertEquals(driver.findElement(By.cssSelector(".ais-InfiniteHits-item:nth-child(1) .css-ewj2et")).getText(),
				"Ovsena kaša sa čokoladom, lešnikom i bademom (organski proizvod) 60 g Bio Špajz");
		assertEquals(driver.findElement(By.cssSelector(".ais-InfiniteHits-item:nth-child(2) .css-ewj2et")).getText(),
				"Ovsena kasa šumsko voće (organski proizvod) 60 g Bio Špajz");
		assertEquals(driver.findElement(By.cssSelector(".ais-InfiniteHits-item:nth-child(3) .css-ewj2et")).getText(),
				"Ovsena kaša sa komadićima čokolade (organski proizvod) 60 g Bio Špajz");
		driver.close();
	}
}

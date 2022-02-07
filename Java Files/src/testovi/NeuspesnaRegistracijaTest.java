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

public class NeuspesnaRegistracijaTest {

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
	public void neuspenaRegistracijaTest() throws InterruptedException {
		driver.get("https://www.biospajz.rs/");
		driver.manage().window().setSize(new Dimension(1051, 806));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".css-ykwscm svg")).click();
		driver.findElement(By.cssSelector(".css-d5gqf1")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("yung99kv@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("tsw2021tsw");
		driver.findElement(By.cssSelector(".css-1seh2f8")).click();
		Thread.sleep(3000);

		String neuspesnaRegistracijaString = driver.findElement(By.cssSelector("#loginRegisterForm > div > p")).getText();
		assertEquals(neuspesnaRegistracijaString,
				"Već postoji nalog sa unetom email adresom. Ako je tvoj, klikni ovde da resetujemo lozinku.");
	}
}

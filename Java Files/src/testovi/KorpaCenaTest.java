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

public class KorpaCenaTest {
	
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
	public void korpaCenaTest() throws InterruptedException {
		driver.get("https://www.biospajz.rs/");
		driver.manage().window().setSize(new Dimension(1051, 806));
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".css-ykwscm svg")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("yung99kv@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("tsw2021");
		driver.findElement(By.cssSelector(".css-1seh2f8")).click();
		Thread.sleep(2000);
		/*
		 * { WebElement element = driver.findElement(By.cssSelector(".css-1seh2f8"));
		 * Actions builder = new Actions(driver);
		 * builder.moveToElement(element).perform(); } { WebElement element =
		 * driver.findElement(By.cssSelector(".css-1seh2f8")); Actions builder = new
		 * Actions(driver); builder.moveToElement(element).perform(); }
		 */
		// driver.findElement(By.cssSelector(".css-s7j65e path")).click();

		driver.get("https://www.biospajz.rs/korpa");
		Thread.sleep(8000);

		// driver.findElement(By.cssSelector(".css-s7j65e:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".css-vurnku:nth-child(1) .css-srf0r8")).click();
		driver.findElement(By.cssSelector(".css-vurnku:nth-child(2) .css-srf0r8")).click();
		driver.findElement(By.cssSelector(".css-vurnku:nth-child(3) .css-srf0r8")).click();
		driver.findElement(By.cssSelector(".css-14l7982:nth-child(1) > .css-vurnku")).click();

		String cena1[] = commaRemove(
				driver.findElement(By.cssSelector(".css-vurnku:nth-child(1) .css-srf0r8")).getText().split(" "));
		float prviProizvodCena = Float.parseFloat(cena1[0]);
		String cena2[] = commaRemove(
				driver.findElement(By.cssSelector(".css-vurnku:nth-child(2) .css-srf0r8")).getText().split(" "));
		float drugiProizvodCena = Float.parseFloat(cena2[0]);
		String cena3[] = commaRemove(
				driver.findElement(By.cssSelector(".css-vurnku:nth-child(3) .css-srf0r8")).getText().split(" "));
		float treciProizvodCena = Float.parseFloat(cena3[0]);
		String ukupnoCena[] = commaRemove(
				driver.findElement(By.cssSelector(".css-14l7982:nth-child(1) > .css-vurnku")).getText().split(" "));
		float ukupno = Float.parseFloat(ukupnoCena[0]);
		
		assertEquals(ukupno, (prviProizvodCena + drugiProizvodCena + treciProizvodCena), 0.01);
		

	}

	public String[] commaRemove(String param[]) {
		if (param[0].contains(",")) {
			param[0] = param[0].replace(",", "");
		}
		return param;
	}
}

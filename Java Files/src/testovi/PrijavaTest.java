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

public class PrijavaTest {
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
  public void prijavaTest() throws InterruptedException {
    driver.get("https://www.biospajz.rs/moj-nalog/");
    driver.manage().window().setSize(new Dimension(1055, 810));
    driver.findElement(By.cssSelector(".css-ykwscm")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("yung99kv@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("tsw2021");
    driver.findElement(By.cssSelector(".css-1seh2f8")).click();
    Thread.sleep(2000);
    String proveraPrijave = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > main > div > span")).getText();
    assertTrue(proveraPrijave.contains("yung99kv@gmail.com"));
  }
    
  
  
}

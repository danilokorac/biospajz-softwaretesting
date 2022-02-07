package testovi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;



public class RegistracijaTest {
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
  public void registracijaTest() throws InterruptedException {
	String preRegistracijeString = "/html/body/div/div[1]/header/div[1]/div/div[2]/div[1]/div/span/div/div";
    driver.get("https://www.biospajz.rs/");
    driver.manage().window().setSize(new Dimension(1062, 816));
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".css-s7j65e path:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".css-1efa4fo")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("yung99kv@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("tsw2021");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".css-1seh2f8")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".css-1seh2f8"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    String posleRegistracijeString = "/html/body/div/div[1]/header/div[1]/div/div[2]/div[1]/div/span";
    assertNotEquals(driver.findElement(By.xpath(preRegistracijeString)), driver.findElement(By.xpath(posleRegistracijeString)));
  }
  
  
  
}

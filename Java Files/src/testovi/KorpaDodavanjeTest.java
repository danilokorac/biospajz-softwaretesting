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

public class KorpaDodavanjeTest {
	
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
  public void korpaDodavanjeTest() throws InterruptedException {
	  	driver.get("https://www.biospajz.rs/");
	    driver.manage().window().setSize(new Dimension(1055, 808));
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".css-s7j65e path:nth-child(2)")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("yung99kv@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("tsw2021");
	    driver.findElement(By.cssSelector(".css-1seh2f8")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.cssSelector(".css-s7j65e")).click();
	    driver.get("https://www.biospajz.rs/korpa");
	    Thread.sleep(4000);
	    {
	    	String prviProizvodString = driver.findElement(By.cssSelector(".css-vurnku:nth-child(1) .css-dygyzd")).getText();
	    	assertEquals(prviProizvodString, "Ulje laneno hladno presovano 250ml Olga");
	    }
	    {
	    	String drugiProizvodString = driver.findElement(By.cssSelector(".css-vurnku:nth-child(2) .css-dygyzd")).getText();
	    	assertEquals(drugiProizvodString, "Ovsena kasa Cokolada,Lesnik,Badem BIO 60g Bio Spajz");
	    }
	    {
	    	String treciProizvodString = driver.findElement(By.cssSelector(".css-vurnku:nth-child(3) .css-dygyzd")).getText();
	    	assertEquals(treciProizvodString, "Spirulina BIO 300 tableta San Sebastian");
	    	
	    }

  }
	    

}

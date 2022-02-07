package testovi;

import static org.junit.Assert.*;


import org.junit.Test;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;

public class BrojArtikalaTest {
	
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
  public void brojArtikalaTest() throws InterruptedException {
    driver.get("https://www.biospajz.rs/");
    driver.manage().window().setSize(new Dimension(1051, 806));
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".css-ykwscm svg")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("yung99kv@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("tsw2021");
    driver.findElement(By.cssSelector(".css-1seh2f8")).click();
    Thread.sleep(2000);
    //driver.findElement(By.cssSelector(".css-s7j65e:nth-child(2)")).click();
    driver.get("https://www.biospajz.rs/korpa/");
    Thread.sleep(6000);
    driver.findElement(By.cssSelector(".css-vurnku:nth-child(1) .css-d20ygd")).click();
    driver.findElement(By.cssSelector(".css-vurnku:nth-child(2) .css-d20ygd")).click();
    driver.findElement(By.cssSelector(".css-vurnku:nth-child(3) .css-d20ygd")).click();
    driver.findElement(By.cssSelector(".css-1d2n6t1")).click();
    
    Integer ocekivanoArtikala = Integer.parseInt(driver.findElement(By.cssSelector(".css-1d2n6t1")).getText());
    //System.out.println(ocekivanoArtikala);
    
    Select valueDrp1 = new Select(driver.findElement(By.cssSelector(".css-vurnku:nth-child(1) .css-d20ygd")));
    Integer prviProizvod = Integer.parseInt(valueDrp1.getFirstSelectedOption().getText());
    
    //System.out.println(prviProizvod);
    
    Select valueDrp2 = new Select(driver.findElement(By.cssSelector(".css-vurnku:nth-child(2) .css-d20ygd")));
    Integer drugiiProizvod = Integer.parseInt(valueDrp2.getFirstSelectedOption().getText());
    
    Select valueDrp3 = new Select(driver.findElement(By.cssSelector(".css-vurnku:nth-child(3) .css-d20ygd")));
    Integer treciProizvod = Integer.parseInt(valueDrp3.getFirstSelectedOption().getText());
    
    assertEquals(ocekivanoArtikala, (prviProizvod + drugiiProizvod + treciProizvod), 0);
    

  }
}

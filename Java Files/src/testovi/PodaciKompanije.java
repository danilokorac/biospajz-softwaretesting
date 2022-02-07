package testovi;


import org.junit.Test;
import org.junit.Before;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;
public class PodaciKompanije{
	
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
	public void testOProdavnici() throws IOException, InterruptedException {
		
		File fk = new File("kompanija-report.txt");
		FileWriter fw = new FileWriter(fk);
		PrintWriter pw = new PrintWriter(fw);
		
		driver.get("https://www.biospajz.rs/o-nama/");
	    driver.manage().window().setSize(new Dimension(1051, 806));
	    Thread.sleep(2000);
		
		 String oNamaString = driver.findElement(By.cssSelector(".css-109gc82")).getText();
		 String naseRadnjeString = driver.findElement(By.cssSelector(".css-r5wu0r")).getText();
		 String nasSajtString = driver.findElement(By.cssSelector(".css-xq5via")).getText();
		 String buducnost = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > main > div.css-m9xyua > div:nth-child(3) > div.css-r5wu0r")).getText();
		 
		 /*System.out.println(oNamaString);
		 System.out.println(naseRadnjeString);
		 System.out.println(nasSajtString);
		 System.out.println(buducnost);*/
		 
		 
		 pw.println("\n=========================== PODACI O KOMPANIJI ================================\n");
		 
		 pw.println(oNamaString);
		 pw.println(naseRadnjeString);
		 pw.println(nasSajtString);
		 pw.println(buducnost);
		 
		 pw.println("\n=========================== PODACI O KOMPANIJI ================================\n");
		 
		 pw.close();
		 
	}
	
}

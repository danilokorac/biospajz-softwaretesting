package testovi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformanseOtvaranjaStranica {

	public static void main(String[] args) throws IOException {
		
		DecimalFormat df = new DecimalFormat("0.00");
		File f1 = new File("performanseOtvaranjaStranica.txt");
		FileWriter fw = new FileWriter(f1);
		PrintWriter pw = new PrintWriter(fw);
		HashMap<String, String> straniceTest = new HashMap<>();
		
		straniceTest.put("Kategorije ", performanseStranice("https://www.biospajz.rs/categories"));
		straniceTest.put("Saveti ", performanseStranice("https://www.biospajz.rs/saveti"));
		straniceTest.put("Razne namirnice ", performanseStranice("https://www.biospajz.rs/saveti/razne-namirnice"));
		straniceTest.put("Zacini i pikant dodaci ",
				performanseStranice("https://www.biospajz.rs/osnovne-namirnice/zacini-i-pikantni-dodaci"));
		straniceTest.put("Kontakt ", performanseStranice("https://www.biospajz.rs/kontakt"));
		straniceTest.put("Kozmetika i higijena ", performanseStranice("https://www.biospajz.rs/kozmetika-i-higijena"));

		double sum = 0;

		for (HashMap.Entry<String, String> element : straniceTest.entrySet()) {
			pw.println(element + " sekunde");
			sum += Double.parseDouble(element.getValue());
		}

		pw.println("Prosecno vreme ucitavanja svih stranica je: " + " " + df.format(sum / straniceTest.size()) + " sekunde");
		pw.close();
	}

	public static String performanseStranice(String url) {

		DecimalFormat df = new DecimalFormat("0.00");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\El Dante\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();

		double start = System.currentTimeMillis();
		driver.get(url);
		double finish = System.currentTimeMillis();
		double total = (finish - start) / 1000;
		driver.quit();

		return df.format(total);

	}

}

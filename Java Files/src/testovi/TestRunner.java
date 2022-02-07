package testovi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
	
	public static void main(String[] args) throws IOException {
		
		Logger log = Logger.getLogger(TestRunner.class.toString());
		
		File f1 = new File("test-report.txt");
		FileWriter fw = new FileWriter(f1);
		PrintWriter pw = new PrintWriter(fw);
		

		// BrojArtikalaTest - Rezultat
		Result brojArtikalaTestResult = JUnitCore.runClasses(BrojArtikalaTest.class);
		
		// GlavnaStranaTest - Rezultat
		Result glavnaStranaTestResult = JUnitCore.runClasses(GlavnaStranaTest.class);
		
		// KorpaCenaTest - Rezultat
		Result korpaCenaTestResult = JUnitCore.runClasses(KorpaCenaTest.class);
		
		// KorpaDodavanjeTest - Rezultat
		Result korpaDodavanjeTestResult = JUnitCore.runClasses(KorpaDodavanjeTest.class);
			
		// NeuspesnaPrijavaTest - Rezultat
		Result neuspesnaPrijavaTestResult = JUnitCore.runClasses(NeuspesnaPrijavaTest.class);
		
		
		// NeuspesnaRegistracijaTest - Rezultat
		Result neuspesnaRegistracijaTestResult = JUnitCore.runClasses(NeuspesnaRegistracijaTest.class);
		
		// PretragaTest - Rezultat
		Result pretragaTestResult = JUnitCore.runClasses(PretragaTest.class);
				
		// PrijavaTest - Rezultat
		Result prijavaTestResult = JUnitCore.runClasses(PrijavaTest.class);
		
		// ProveraPodatakaTest - Rezultat
		Result proveraPodatakaTest = JUnitCore.runClasses(ProveraPodatakaTest.class);
		
		// RegistracijaTest - Rezultat
		Result registracijaTestResult = JUnitCore.runClasses(RegistracijaTest.class);
		
		
		pw.println("========================= TEST REPORT =========================\n");
		
		if(brojArtikalaTestResult.wasSuccessful()) {
			log.info("BrojArtikalaTest je uspesno prosao!");
			pw.println("Naziv testa: BrojArtikalaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test BrojArtikalaTest proverava da li je kolicina (broj artikala) koji"
					+ " se nalaze u korpi jednak ukupnoj kolicini koja je zadata na sajtu, tako sto sabira broj"
					+ " artikala za svaki proizvod i poredi tu vrednost sa ocekivanom vrednoscu.");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(glavnaStranaTestResult.wasSuccessful()) {
			log.info("GlavnaStranaTest je uspesno prosao!");
			pw.println("Naziv testa: GlavnaStranaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test GlavnaStranaTest proverava da li se glavni naslov na stranici podudara"
					+ " sa ocekivanim tekstom");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(korpaCenaTestResult.wasSuccessful()) {
			log.info("KorpaCenaTest je uspesno prosao!");
			pw.println("Naziv testa: KorpaCenaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test KorpaCenaTest proverava da li se ukupna cena svih artikala u korpi"
					+ " podudara sa cenom koja je zadata na samoj stranici. Da bi se test izvrsio uzima se cena"
					+ " svakog proizvoda u korpi kao i ukupna cena za sve proizvode. Zatim se proverava da li"
					+ " je ukupna zadata cena jednaka zbiru proizvoda u korpi");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(korpaDodavanjeTestResult.wasSuccessful()) {
			log.info("KorpaDodavanjeTest je uspesno prosao!");
			pw.println("Naziv testa: KorpaDodavanjeTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test KorpaDodavanjeTest proverava da li su proizvodi koji su dodati"
					+ " u korpu korektnu tj. da li su uspesno dodati u korpu. Test se izvrsava tako"
					+ " sto proverava ocekivane nazive dodatih proizvoda sa stvarnim dodatim proizvodima.");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(neuspesnaPrijavaTestResult.wasSuccessful()) {
			log.info("NeuspesnaPrijavaTest je uspesno prosao!");
			pw.println("Naziv testa: NeuspesnaPrijavaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test NeuspesnaPrijavaTest proverava da li podaci koji se unose prilikom"
					+ " prijave nisu korektni, tj. da li uneti mail ili sifra ne odgovaraju korisniku koji je"
					+ " prethodno bio registrovan.");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(neuspesnaRegistracijaTestResult.wasSuccessful()) {
			log.info("NeuspesnaRegistracijaTest je uspesno prosao!");
			pw.println("Naziv testa: NeuspesnaRegistracijaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test NeuspesnaRegistracijaTest proverava da li su podaci koji se unose"
					+ " prilikom registracije nisu korektni, tj. da li neki korisnik pokusava da se registruje"
					+ "sa mailom sa kojim vec postoji nalog na samom sajtu.");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(pretragaTestResult.wasSuccessful()) {
			log.info("PretragaTest je uspesno prosao!");
			pw.println("Naziv testa: PretragaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test PretragaTest proverava da li prilikom unosa u pretragu za odredjeni"
					+ " proizvod, prva tri proizvoda odgovaraju trazenim podacima. Test funkcionise tako sto nakon"
					+ " pretrage za odredjenu vrstu proizvoda uzima nazive prva tri proizvoda iz liste, i proverava"
					+ " ih sa ocekivanim nazivom");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(prijavaTestResult.wasSuccessful()) {
			log.info("PrijavaTest je uspesno prosao!");
			pw.println("Naziv testa: PrijavaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test PrijavaTest proverava da li je korisnik uspesno prijavljen."
					+ " Test funkcionise tako sto proverava da li mail koji se koristi prilikom prijave odgovara"
					+ " ocekivanom mailu koji se prikazuje kada se korisnik prijavi.");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(proveraPodatakaTest.wasSuccessful()) {
			log.info("ProveraPodatakaTest je uspesno prosao!");
			pw.println("Naziv testa: ProveraPodatakaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test ProveraPodatakaTest proverava da li podaci koji se unose pri registraciji"
					+ " podudaraju sa onima koji se nalaze u opisu naloga samog korisnika. U ovom slucaju posto"
					+ " registracija i prijava izgledaju identicno, koriscena je prijava umesto registracije."
					+ "	Test funkcionise tako sto uzima vrednost emaila koji se nalazi u opisu podataka korisnika"
					+ " (jedini podatak koji ima na profilu korisnika, velika mana..) i proverava da li je jednak"
					+ " ocekivanoj vrednosti tj. vrednosti maila prilikom prijave.");
			
		}
		
		pw.println("\n===================================================================\n");
		
		if(registracijaTestResult.wasSuccessful()) {
			log.info("RegistracijaTest je uspesno prosao!");
			pw.println("Naziv testa: RegistracijaTest");
			pw.println("Prolaznost testa: uspesno prosao");
			pw.println("Opis testa: Test RegistracijaTest proverava da li je korisnik uspesno registrovan."
					+ " Test funkcionise tako sto proverava da li se ikonica koja se nalazi na sajtu, a koja"
					+ " predstavlja ikonicu naloga korisnika, razlikuje od ikonice koja se pojavljuje nakon"
					+ " uspesne registracije");
			
		}
				

		pw.close();
	}

}

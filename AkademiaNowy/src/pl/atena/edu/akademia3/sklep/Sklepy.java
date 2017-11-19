package pl.atena.edu.akademia3.sklep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sklepy {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(final String[] args) throws SecurityException, IOException {

		Osiedlowy sklepik = new Osiedlowy();
		Biedronka biedroneczka = new Biedronka();
		¯abka ¿abcia = new ¯abka();
		List<SklepNowy> listaSklepow = new ArrayList<>();
		Logger logger = Logger.getLogger(Sklepy.class.getCanonicalName());
		logger.setLevel(Level.SEVERE);
		Handler handler = new ConsoleHandler();
		handler.setLevel(Level.SEVERE);
		FileHandler handlerFile = new FileHandler("D:\\logi.log",true);
		handlerFile.setLevel(Level.SEVERE);
		logger.addHandler(handler);
		logger.addHandler(handlerFile);
		listaSklepow.add(sklepik);
		listaSklepow.add(biedroneczka);
		listaSklepow.add(¿abcia);
		logger.info("sklepy utworzone");
		Logger.getGlobal().addHandler(handlerFile);
		OsobaFizyczna klient = new OsobaFizyczna("Jan", "Nowak", 17);
		OsobaFizyczna klient2 = new OsobaFizyczna("Marek", "Kowalski", 22);
		List<OsobaFizyczna> listaKlientow = new ArrayList<>();
		listaKlientow.add(klient);
		listaKlientow.add(klient2);
		listaKlientow.sort(Comparator.comparing(OsobaFizyczna::getNazwisko));
		logger.info("klienci utworzeni");

		Integer x = 0;
		do {
			System.out.println("\n1. Dostawa\n" + "2. Sprzedaj Janowi\n" + "3. Sprzedaj Markowi\n"
					+ "4. Wyœwietl stan\n" + "5. Wyœwietl stan sklepow\n" + "6. uruchom promocje\n"
					+ "7. Cena bazowa z modyfikatorem parzystym\n" + "8. Cena bazowa z modyfikatorem nieparzystym\n"+
					"9. Cena bazowa z modyfikatorem\n"+"10. Cena bazowa podstawowa\n"+"inne. zakoñcz");
			try {
				x = Integer.valueOf(scanner.nextLine());
			} catch (Exception e) {
				logger.severe("Naucz siê korzystaæ z programu!!!");
			}
			switch (x) {
			case 1:
				sklepik.dostawa();
				break;
			case 2:
				try {
					sklepik.procesSprzedazy(klient);
				} catch (UnderAgeException e1) {
					// TODO Auto-generated catch block
				}
				break;
			case 3:
				try {
					sklepik.procesSprzedazy(klient2);
				} catch (UnderAgeException e) {
					// TODO Auto-generated catch block
				}
				break;
			case 4:
				System.out.println("Sklepy:");
				listaSklepow.forEach(System.out::println);
				System.out.println("Klienci:");
				listaKlientow.forEach(System.out::println);

				System.out.println("\n");
				break;
			case 5:
				listaSklepow.forEach(System.out::println);
				System.out.println("\n");
				break;
			case 6:
				listaSklepow.forEach(o -> o.promocja());
				break;
			case 7:
				listaSklepow.forEach(o -> {o.getListaZatowarowania().getTowary().forEach(o2->o2.CenaBazowaWymus(true));
				});
				break;
			case 8:
				listaSklepow.forEach(o -> {o.getListaZatowarowania().getTowary().forEach(o2->o2.CenaBazowaWymus(false));
				});
				break;
			case 9:
				listaSklepow.forEach(o -> {o.getListaZatowarowania().getTowary().forEach(o2->o2.CenaBazowaZModyfikatorem());
				});
				break;
			case 10:
				listaSklepow.forEach(o -> {o.getListaZatowarowania().getTowary().forEach(o2->o2.CenaBazowa());
				});
				break;
			default:
				break;
			}
		} while (x.compareTo(11) < 0 && x.compareTo(0) > 0);

	}

}

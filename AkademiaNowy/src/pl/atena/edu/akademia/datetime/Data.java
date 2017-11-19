package pl.atena.edu.akademia.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Data {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		Instant data = Instant.now();
		LocalDate datka = LocalDate.of(1987, Month.SEPTEMBER, 21);
		LocalDate datka2 = LocalDate.of(1995, Month.FEBRUARY, 28).plusDays(365);

		System.out.println(datka);
		System.out.println(datka2);
		Period period = Period.between(datka, datka2);
		System.out.println(period);

		System.out.println(Instant.MIN);
		System.out.println(Instant.MAX);
		System.out.println(Instant.EPOCH);
		long dni = datka.until(LocalDate.now(), ChronoUnit.DAYS);
		System.out.println("¿yjê "+dni+" dni");

		//	ZoneId.getAvailableZoneIds().forEach(System.out::println);

		ZonedDateTime zdt = ZonedDateTime.now();
		Instant instant = zdt.toInstant();

	}

}

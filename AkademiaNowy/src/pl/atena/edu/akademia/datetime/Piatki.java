package pl.atena.edu.akademia.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Piatki {
	public static void main(final String[] args) {
		LocalDate start = LocalDate.of(1901, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2000, Month.DECEMBER, 31);
		List<LocalDate> listaDat = new ArrayList<>();
		LocalDate pierwszyPiatek = start.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		while (pierwszyPiatek.isBefore(end)) {
			if (pierwszyPiatek.getDayOfMonth() == 13) {
				listaDat.add(pierwszyPiatek);
			}
			pierwszyPiatek = pierwszyPiatek.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		}
		System.out.println(listaDat.size());
		listaDat.forEach(System.out::println);
	}
}

package pl.atena.edu.akademia.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class DniTygodnia {
	public static void main(final String[] args) {
		LocalDate start = LocalDate.of(1901, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2000, Month.DECEMBER, 31);
		List<LocalDate> MondayList = new ArrayList<>();
		List<LocalDate> TuesdayList = new ArrayList<>();
		List<LocalDate> WednesdayList = new ArrayList<>();
		List<LocalDate> ThursdayList = new ArrayList<>();
		List<LocalDate> FridayList = new ArrayList<>();
		List<LocalDate> SaturdayList = new ArrayList<>();
		List<LocalDate> SundayList = new ArrayList<>();
		List<List<LocalDate>> Lista = new ArrayList<>();
		Lista.add(MondayList);
		Lista.add(TuesdayList);
		Lista.add(WednesdayList);
		Lista.add(ThursdayList);
		Lista.add(FridayList);
		Lista.add(SaturdayList);
		Lista.add(SundayList);
		while (start.isBefore(end)) {
			if (start.getDayOfMonth() == 13) {
				DayOfWeek dzien = start.getDayOfWeek();
				switch (dzien) {
				case MONDAY:
					MondayList.add(start);
					break;
				case TUESDAY:
					TuesdayList.add(start);
					break;
				case WEDNESDAY:
					WednesdayList.add(start);
					break;
				case THURSDAY:
					ThursdayList.add(start);
					break;
				case FRIDAY:
					FridayList.add(start);
					break;
				case SATURDAY:
					SaturdayList.add(start);
					break;
				case SUNDAY:
					SundayList.add(start);
					break;
				}
			}
			start = start.plusDays(1);
		}

		Lista.forEach(o->{
			System.out.println(o.get(0).getDayOfWeek()+" "+o.size());
		});
	}
}

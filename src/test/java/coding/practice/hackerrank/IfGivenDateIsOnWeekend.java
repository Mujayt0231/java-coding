package coding.practice.hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class IfGivenDateIsOnWeekend {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		boolean isWeekendToday = isWeekend(now);

		System.out.println(isWeekendToday);

	}

	public static boolean isWeekend(LocalDate date) {

		if (date == null) {
			throw new IllegalArgumentException("Data cannot be null!");
		}

		DayOfWeek day = date.getDayOfWeek();

		return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
	}

}

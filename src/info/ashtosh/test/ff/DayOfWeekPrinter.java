package info.ashtosh.test.ff;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfWeekPrinter {
	public static void main(String[] args) {
		int year = 2024;
		int month = 1; // January

		printDayOfWeek(year, month);
	}

	private static void printDayOfWeek(int year, int month) {
		LocalDate startDate = LocalDate.of(year, month, 1);
		LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

		for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			System.out.println();
			System.out.println("<section class=\""
					+ (dayOfWeek == DayOfWeek.SATURDAY ? "saturday" : dayOfWeek == DayOfWeek.SUNDAY ? "sunday" : "")
					+ "\">");
			System.out.println("    <div class=\"left-box\"></div>");
			System.out.println(
					"    <div class=\"section-number\">" + date.format(DateTimeFormatter.ofPattern("d")) + "</div>");
			System.out.println("</section>");
		}
	}
}

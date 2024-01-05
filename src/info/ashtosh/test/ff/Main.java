package info.ashtosh.test.ff;

public class Main {
	public static void main(String[] args) {
		int month = 4;
		System.out.println(java.time.LocalDate.of(2024, month, 1).getDayOfMonth());

		for (int day = 1; day <= java.time.LocalDate.of(2024, month, day).getDayOfMonth(); day++) {
			int dayOfWeek = getDayOfWeek(2024, month, day); // 0 (Sunday) to 6 (Saturday)
			boolean isSaturday = dayOfWeek == 6;
			boolean isSunday = dayOfWeek == 0;

			System.out.println("<section class=\"" + (isSaturday ? "saturday" : isSunday ? "sunday" : "") +"\">");
			System.out.println("    <div class=\"left-box\"></div>");
			System.out.println("    <div class=\"section-number\">" + day + "</div>");
			System.out.println("</section>");
		}
	}

	private static int getDayOfWeek(int year, int month, int day) {
		java.time.LocalDate date = java.time.LocalDate.of(year, month, day);
		return date.getDayOfWeek().getValue() % 7; // Adjust to 0-based index
	}
}




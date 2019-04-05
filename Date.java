public class Date implements Comparable<Date> {
	public int year;
	public int month;
	public int day;

	public Date(int year, int month, int day) {
		if(month < 1 || month > 12) { throw new IllegalArgumentException("Months must be between 1 and 12."); }
		if(day < 1 || day > 31) { throw new IllegalArgumentException("Days must be between 1 and 31."); }

		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int compareTo(Date other) {
		if(year != other.year) { return year - other.year; }
		else if(month != other.month) { return month - other.month; }
		else if(day != other.day) { return day - other.day; }
		else { return 0; }
	}

	public String toString() {
		return formatComponent(year) + "-" + formatComponent(month) + "-" + formatComponent(day);
	}

	private String formatComponent(int num) {
		return (num < 10 ? "0" : "") + num;
	}
}
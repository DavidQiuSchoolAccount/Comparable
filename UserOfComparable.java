import java.util.*;

public class UserOfComparable {
	public static void main(String[] args) {
		printComparison(0, 0);
		printComparison(200, 100);
		printComparison("a", "b");
		printComparison(new Point(100, 500), new Point(100, 100));
		printComparison(new Date(2019, 4, 4), new Date(2018, 9, 24));

		// Dogs cannot be passed to printComparison() because it does not implement Comparable. A compiler error results.
		// printComparison(new Dog(), new Dog());

		// Points and dates cannot be compared. A ClassCastException is thrown at runtime.
		// printComparison(new Point(0, 0), new Date(2000, 1, 1));

		List<Point> points = new ArrayList<>();
		points.add(new Point(0, 0));
		points.add(new Point(300, -200));
		points.add(new Point(10, 50));
		points.add(new Point(40, 10));
		points.add(new Point(-1000, -1000));
		Collections.sort(points);
		System.out.println("Sorted points: " + points);

		List<Date> dates = new ArrayList<>();
		dates.add(new Date(2019, 4, 4));
		dates.add(new Date(2003, 2, 1));
		dates.add(new Date(2013, 12, 10));
		dates.add(new Date(2011, 10, 15));
		dates.add(new Date(2000, 1, 1));
		Collections.sort(dates);
		System.out.println("Sorted dates: " + dates);
	}

	private static void printComparison(Comparable first, Comparable second) {
		String compStr;
		int result = first.compareTo(second);
		if(result < 0) { compStr = "less than"; }
		else if(result > 0) { compStr = "greater than"; }
		else { compStr = "equal to"; }

		System.out.println(first.getClass().getSimpleName() + " " + first + " is " + compStr + " " + second.getClass().getSimpleName() + " " + second + ".");
	}
}
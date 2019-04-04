import java.util.*;

public class UserOfComparable {
	public static void main(String[] args) {
		printComparison(0, 0);
		printComparison(200, 100);
		printComparison("a", "b");
		printComparison(new Point(100, 500), new Point(100, 100));

		List<Point> points = new ArrayList<>();
		points.add(new Point(0, 0));
		points.add(new Point(300, -200));
		points.add(new Point(10, 50));
		points.add(new Point(40, 10));
		points.add(new Point(-1000, -1000));
		Collections.sort(points);
		System.out.println("Sorted points: " + points);
	}

	private static void printComparison(Comparable first, Comparable second) {
		String compStr;
		int result = first.compareTo(second);
		if(result < 0) { compStr = "less than"; }
		else if(result > 0) { compStr = "greater than"; }
		else { compStr = "equal to"; }

		System.out.println("[" + first + "] is " + compStr + " [" + second + "].");
	}
}
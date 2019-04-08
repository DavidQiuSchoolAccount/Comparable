public class Point implements Comparable<Point> {
	public double x;
	public double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceFromOrigin() {
		return Math.hypot(x, y);
	}

	public int compareTo(Point other) {
		return (int) (distanceFromOrigin() - other.distanceFromOrigin());
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
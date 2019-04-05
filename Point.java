public class Point implements Comparable<Point> {
	public double x;
	public double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}

	public int compareTo(Point other) {
		double dist = distanceFromOrigin();
		double otherDist = other.distanceFromOrigin();

		if(dist == otherDist) { return 0; }
		else { return (int) (dist - otherDist); }
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
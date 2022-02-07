package Lab1_part2;

public class sphere {
	public int radius;
	public double surfaceArea;
	public sphere(int rad) {
		radius=rad;
	}
	public double Calculations() {
		surfaceArea=4*3.14*radius;
		return surfaceArea;
	}
}

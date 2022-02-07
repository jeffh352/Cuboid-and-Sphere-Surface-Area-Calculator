package Lab1_part2;

public class cuboid {
	public int length;
	public int width;
	public int height;
	public double surfaceArea;
	public cuboid(int len, int wid, int hei) {
		length=len;
		width=wid;
		height=hei;
	}
	public double Calculations() {
		surfaceArea=(2*(length*width)+2*(length*height)+2*(height*width));
		return surfaceArea;
	}
}

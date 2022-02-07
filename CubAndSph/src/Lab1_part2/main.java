package Lab1_part2;

public class main {
	public static void main(String[]args) {
		cuboid cube=new cuboid(3, 6, 7);
		sphere sph=new sphere(6);
		System.out.println("Cuboid surface area: "+cube.Calculations());
		System.out.println("=======================");
		System.out.println("Sphere surface area: "+sph.Calculations());
	}
}

package study.sem_3.extra.third_extra;

public class Cube implements Shape, VolumetricShapes {
	
	private double edge;
	
	public Cube(double edge) {
		this.edge = edge;
	}
	
	@Override
	public double area() {
		return 6 * edge * edge;
	}
	
	@Override
	public double volume() {
		return edge * edge * edge;
	}
}
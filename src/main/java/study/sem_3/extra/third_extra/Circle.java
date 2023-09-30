package study.sem_3.extra.third_extra;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return 2 * 3.14 * radius;
	}

}

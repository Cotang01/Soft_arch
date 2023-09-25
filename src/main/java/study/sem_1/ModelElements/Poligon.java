package study.sem_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

import study.sem_1.Stuff.Point3D;

// Класс полигонов
public class Poligon {
	
	public List<Point3D> points;
	
	
	// Конструктор
	public Poligon(Point3D point) {
		this.points = new ArrayList<>();
		this.points.add(point);
	}
}

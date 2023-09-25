package study.sem_1.ModelElements;

import java.awt.Color;

import study.sem_1.Stuff.Angle3D;
import study.sem_1.Stuff.Point3D;

// Класс освещения
public class Flash {
	
	public Point3D location;
	public Angle3D angle;
	public Color color;
	public Float power;
	
	// Функция поворота угла освещения
	public void rotate(Angle3D angle) {
		//TODO rotation logic
	}
	
	// Функция перемещения точки освещения
	public void move(Point3D point) {
		//TODO moving logic
	}
}

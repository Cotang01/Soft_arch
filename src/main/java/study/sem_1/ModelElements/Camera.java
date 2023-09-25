package study.sem_1.ModelElements;

import java.util.List;

import study.sem_1.Stuff.Angle3D;
import study.sem_1.Stuff.Point3D;

// Класс камеры
public class Camera {
	
	public List<Point3D> location;
	public List<Angle3D> angle;
	
	// Функция повотора угла камеры
	public void rotate(Angle3D angle) {
		//TODO rotation logic
	}
	
	// Функция перемещения камеры
	public void move(Point3D point) {
		//TODO moving logic
	}

}


package study.sem_1.ModelElements;

import java.awt.Window.Type;
import java.util.List;


public class Scene {
	
	public Integer id = 0;
	public List<PoligonalModel> models;
	public List<Flash> flashes;
	public List<Camera> cameras;
	
	public Type method1(Type type) {
		return null; //TODO method1 logic
	}
	
	public Type method2(Type type1, Type type2) {
		return null; //TODO method2 logic
	}
	
	public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
		this.id = id++;
		this.models = models;
		this.flashes = flashes;
		this.cameras = cameras;
		this.models.add(new PoligonalModel(null));
	}
}

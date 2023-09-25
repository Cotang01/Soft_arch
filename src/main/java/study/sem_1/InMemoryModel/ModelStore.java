package study.sem_1.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import study.sem_1.ModelElements.Camera;
import study.sem_1.ModelElements.Flash;
import study.sem_1.ModelElements.PoligonalModel;
import study.sem_1.ModelElements.Scene;

public class ModelStore {

	public List<PoligonalModel> models;
	public List<Scene> scenes;
	public List<Flash> flashes;
	public List<Camera> cameras;
	private IModelChangedObserver[] changeObservers;
	
	
	// Поиск сцены по id
	public Scene getScene(Integer id) {
		return null; //TODO getting logic
	}
	
	
	// Оповещение изменений
	public void notifyChange(IModelChanger sender) {
		//TODO notify logic
	}
	
	public ModelStore(IModelChangedObserver[] changeObservers) {
		this.models = new ArrayList<>();
		this.scenes = new ArrayList<>();
		this.flashes = new ArrayList<>();
		this.cameras = new ArrayList<>();
		this.changeObservers = changeObservers;
		this.models.add(new PoligonalModel(null));
		this.scenes.add(new Scene());
		this.flashes.add(new Flash());
		this.cameras.add(new Camera());
	}
	
}

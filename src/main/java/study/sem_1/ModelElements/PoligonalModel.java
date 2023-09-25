package study.sem_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

// Класс полигональных моделей
public class PoligonalModel {
	
	public List<Poligon> poligons;
	public List<Texture> textures;
	
	// Конструктор
	public PoligonalModel(List<Texture> textures) {
		this.textures = textures;
		this.poligons = new ArrayList<>();
	}
}

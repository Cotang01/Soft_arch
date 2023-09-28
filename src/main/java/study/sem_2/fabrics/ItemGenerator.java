package study.sem_2.fabrics;

import study.sem_2.interfaces.IGameItem;

public abstract class ItemGenerator {
	
	public abstract IGameItem createItem();
	
	public void openReward() {
		createItem().open();
	}
	
}

package study.sem_2.fabrics;

import study.sem_2.interfaces.IGameItem;
import study.sem_2.products.StoneReward;

public class StoneGenerator extends ItemGenerator {

	@Override
	public IGameItem createItem() {
		return new StoneReward();
	}

}

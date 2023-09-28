package study.sem_2.fabrics;

import study.sem_2.interfaces.IGameItem;
import study.sem_2.products.GoldReward;

public class GoldGenerator extends ItemGenerator {

	@Override
	public IGameItem createItem() {
		return new GoldReward();
	}

}

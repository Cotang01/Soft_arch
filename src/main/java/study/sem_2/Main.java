package study.sem_2;

import study.sem_2.fabrics.BronzeGenerator;
import study.sem_2.fabrics.CoalGenerator;
import study.sem_2.fabrics.DirtGenerator;
import study.sem_2.fabrics.GemGenerator;
import study.sem_2.fabrics.GoldGenerator;
import study.sem_2.fabrics.IronGenerator;
import study.sem_2.fabrics.ItemGenerator;
import study.sem_2.fabrics.SilverGenerator;
import study.sem_2.fabrics.StoneGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		
		ItemGenerator dirt_fab1 = new DirtGenerator();
		ItemGenerator stone_fab1 = new StoneGenerator();
		ItemGenerator coal_fab1 = new CoalGenerator();
		ItemGenerator iron_fab1 = new IronGenerator();
		ItemGenerator bronze_fab1 = new BronzeGenerator();
		ItemGenerator silver_fab1 = new SilverGenerator();
		ItemGenerator gold_fab1 = new GoldGenerator();
		ItemGenerator gem_fab1 = new GemGenerator();
		
		
		List<ItemGenerator> item_generators = new ArrayList<>();
		
		item_generators.add(dirt_fab1); // 0
		item_generators.add(stone_fab1); // 1
		item_generators.add(coal_fab1); // 2
		item_generators.add(iron_fab1); // 3
		item_generators.add(bronze_fab1); // 4
		item_generators.add(silver_fab1); // 5
		item_generators.add(gold_fab1); // 6
		item_generators.add(gem_fab1); // 7
		
		Random randomizer = ThreadLocalRandom.current();
		
		int total_chests = 100;
		
		// Соотношение 10:10:10:10:10:10:3:1
		
		for (int i = 0; i < total_chests; i++) {
			int temp = randomizer.nextInt(65);
			if (0 < temp && temp <= 10) {
				item_generators.get(0).openReward(); // dirt
			} else if (10 < temp && temp <= 20) {
				item_generators.get(1).openReward(); // stone
			} else if (20 < temp && temp <= 30) {
				item_generators.get(2).openReward(); // coal
			} else if (30 < temp && temp <= 40) {
				item_generators.get(3).openReward(); // iron
			} else if (40 < temp && temp <= 50) {
				item_generators.get(4).openReward(); // bronze
			} else if (50 < temp && temp <= 60) {
				item_generators.get(5).openReward(); // silver
			} else if (60 < temp && temp <= 63) {
				item_generators.get(6).openReward(); // gold
			} else if (temp == 64) {
				item_generators.get(7).openReward(); // gem
			}
			
		}
		
	}

}

package by.epam.training.appliances.main;

import java.util.ArrayList;
import java.util.List;

import by.epam.training.appliances.entity.Appliances;
import by.epam.training.appliances.entity.Fridge;
import by.epam.training.appliances.entity.HairDryer;
import by.epam.training.appliances.entity.VacuumCleaner;

public class Main {
	public static void main(String[] args) {
		List<Appliances> appliances = new ArrayList<Appliances>();
		
		appliances.add(new HairDryer("HDr Rowenta", 50, 700, "A+", 3, 3, true));
		appliances.add(new HairDryer("HDr Vitek", 35, 600, "A", 2, 3, false));
		appliances.add(new HairDryer("HDr Braun", 55, 550, "A", 3, 2, false));
		appliances.add(new HairDryer("HDr Dyson", 100, 800, "A++", 3, 3, true));
		appliances.add(new Fridge("Fridge Atlant", 1000, 40, "A+", 70, 3, 5));
		appliances.add(new Fridge("Fridge LG", 2500, 30, "A++", 50, 5, 4));
		appliances.add(new Fridge("Fridge Indesit", 1500, 50, "A+", 60, 2, 5));
		appliances.add(new VacuumCleaner("VC Dyson", 1000, 1000, "A++", 3, 5, "carpet brush"));
		appliances.add(new VacuumCleaner("VC Viomi", 100, 800, "A", 3, 5, "floor brush"));
		appliances.add(new VacuumCleaner("VC Bosch", 500, 900, "A", 3, 5, "carpet brush"));
		appliances.add(new VacuumCleaner("VC Samsung", 700, 1500, "A++", 3, 5, "furniture brush"));
		
		for(int i=0; i<appliances.size(); i++) {
			Appliances app = appliances.get(i);
			int minPrice = 150;
			int maxPrice = 500;
			if(appliances.get(i).getPrice() > minPrice && appliances.get(i).getPrice() <= maxPrice) {
				System.out.println("Appliances with price from " + minPrice + " to " + maxPrice + " are: " + app.getModel() + ": " + app.info());
			}
						
		}

		for(int i=0; i<appliances.size(); i++) {
			Appliances app = appliances.get(i);
			if(appliances.get(i).getModel().contains("VC")) {
				System.out.println("Appliances with model 'VC' are: " + app.getModel() +  "-" + app.info());
			}
						
		}
		

	}

}

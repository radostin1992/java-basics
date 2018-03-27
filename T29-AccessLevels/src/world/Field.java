package world;

public class Field {
	private Plant plant = new Plant();

	public Field() {
		// size is protected; Foeld is the same package as Plant;
		System.out.println(plant.size);

	}
}

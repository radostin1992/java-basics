import world.Plant;

public class App {
	/*
	 * private - only within same class; public - from anywhere; protected - same
	 * class, subclass and same package; no modifier - same package
	 */
	public static void main(String[] args) {
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);

		// Won't work - type is private
		// System.out.println(plant.type);

		// Won't work - size is protected; App is not in the same package as Plant.
		// System.out.println(plant.size);

		// Won't work; App and Plant are in different packages, height has package-level
		// visibility.
		// System.out.println(plant.height);
	}

}

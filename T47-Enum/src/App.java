
public class App {
	// public static final int DOG = 0;
	// public static final int CAT = 1;
	// public static final int MOUSE = 2;

	public static void main(String[] args) {
		// int animal = CAT;
		Animal animal = Animal.CAT;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		}
		System.out.println(Animal.CAT);
		System.out.println("Enum name as a string: " + Animal.CAT.name());

		Animal animal2 = Animal.valueOf("DOG");
		System.out.println(animal2);

	}

}

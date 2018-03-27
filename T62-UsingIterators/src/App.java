import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		Iterator<String> it = animals.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			if (value.equals("cat")) {
				it.remove();
			}
		}

		System.out.println();

		/// Modernn iteration, Java 5
		for (String animal : animals) {
			System.out.println(animal);
		}
	}

}

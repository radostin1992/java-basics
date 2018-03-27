
public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();

		Person person = new Person("John");
		person.greet();

		Info info1 = new Machine();
		info1.showInfo();

		Info info2 = person;
		info2.showInfo();

		System.out.println();
		outputinfo(mach1);
		outputinfo(person);
	}

	private static void outputinfo(Info info) {
		info.showInfo();
	}
}

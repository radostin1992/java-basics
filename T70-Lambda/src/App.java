interface Executable {
	int execute(int a, int b);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Exeuting code block ...");
		int value = e.execute(12, 13);
		System.out.println("Return value is: " + value);
	}

	public void run(StringExecutable e) {
		System.out.println("Exeuting code block ...");
		int value = e.execute("Hi");
		System.out.println("Return value is: " + value);
	}

}
// () -> System.out.println("Hello there.")

// () -> {
// System.out.println("Hello there.");
// System.out.println("This is code passed in a lambda expression.");
// });

// runner.run(() -> {
// System.out.println("Hello there.");
// System.out.println("This is code passed in a lambda expression.");
// return 8;
// });

// runner.run(() -> {
// return 8;
// });

// () -> 8

// (int a) -> 8

// runner.run((int a) -> {
// System.out.println("Hello there.");
// return 7 + a;
// });

// (a) -> {
// System.out.println("Hello there.");
// return 7 + a;
// });

// a -> {
// System.out.println("Hello there.");
// return 7 + a;
// });

// runner.run((a, b) -> {
// System.out.println("Hello there.");
// return 7 + a;
// });
public class App {

	public static void main(String[] args) {

		int c = 100;
		// Mustn't do this: c = 8;
		int d = 77;

		Runner runner = new Runner();
		runner.run(new Executable() {

			@Override
			public int execute(int a, int b) {
				System.out.println("Hello there.");
				// Can do this in methods of anonymous classes int d=8;
				return c + a + b;
			}
		});

		System.out.println("===============================");

		runner.run((a, b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		});

		Executable ex = (a, b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};
		runner.run(ex);

		Object codeblock = (Executable) (a, b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};

	}

}

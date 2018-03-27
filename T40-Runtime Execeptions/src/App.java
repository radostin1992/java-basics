
public class App {

	public static void main(String[] args) {
		// Null pointer exception ....
		// int n = 7;
		// int value = 7/0;

		// Arithmetic exception ... (divide by zero)
		// String text = null;
		// System.out.println(text.length());

		// You can actually handle RuntimeExceptions if you want to;
		// for example, here we handle an ArrayIndexOutOfBoundsException
		String[] texts = { "one", "two", "three" };
		try {
			System.out.println(texts[3]);
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}

	}

}

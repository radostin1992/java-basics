import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Test test = new Test();

		// try {
		// test.run();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (ParseException e) {
		// System.out.println("Couldn't parse command file.");
		// }

		// try {
		// test.run();
		// } catch (IOException | ParseException e) {
		// // TODO Auto-generated catch block
		// System.out.println("Test multicatch");
		// }

		// try {
		// test.run();
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// try {
		// test.input();
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Because of IOException there is no FileNotFoundException in multi-catch
		// block -> it's child class
		// exception.

		try {
			test.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

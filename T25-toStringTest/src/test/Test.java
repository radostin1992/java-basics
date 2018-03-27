package test;

class Frog {
	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append(id).append(" : ").append(name); return sb.toString();
		 */
		return String.format("%-4d: %S", id, name);
	}

}

public class Test {
	public static void main(String[] args) {
		Frog frog1 = new Frog(1, "John");

		System.out.println(frog1);

	}
}

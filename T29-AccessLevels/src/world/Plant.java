package world;

public class Plant {
	// Bad practice
	public String name;
	// Acceptable practice
	public final static int ID = 8;

	private String type;

	protected String size;

	int height;

	public Plant() {
		this.name = "Rose";
		type = "plant";
		this.size = "medium";
		this.height = 8;
	}
}

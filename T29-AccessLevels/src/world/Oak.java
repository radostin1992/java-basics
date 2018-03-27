package world;

public class Oak extends Plant {
	public void Oak() {
		// Won't work type - is private
		// type = "tree";

		// Works - size is protected and oak is subclass
		this.size = "large";

		// No access specifier; works bacause Oak and Plant are in the sama package.
		this.height = 10;
	}
}

public class TowerOfHanoi {
	private static int count = 0;

	public static void main(String[] args) {
		playHanoi(3, "A", "B", "C");
	}

	// move n disks from position "from" to "to" via "other"
	private static void playHanoi(int n, String from, String other, String to) {
		if (n == 0)
			return;
		if (n > 0)
			playHanoi(n - 1, from, to, other);
		System.out.printf("Move one disk from pole %s to pole %s \n ", from, to);

		System.out.println(count++);
		playHanoi(n - 1, other, from, to);
	}
}

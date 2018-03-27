
public class App {
	public static void main(String[] args) {
		Robot robot1 = new Robot(5);
		robot1.start();

		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}

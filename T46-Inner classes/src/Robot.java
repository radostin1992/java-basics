
public class Robot {
	private int id;

	private class Brain {
		private void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}

	static class Battery {
		public void charge() {
			System.out.println("Battery charging ...");

		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot " + id);

		Brain brain1 = new Brain();
		brain1.think();

		String name = "Rob";

		class Temp {
			public void doSomething() {
				System.out.println("ID is " + id);
				System.out.println("My name is " + name);
			}
		}
		Temp temp = new Temp();
		temp.doSomething();
	}
}

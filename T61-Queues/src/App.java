import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		// (head) <- ooooooooo <- (tail) FIFO

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		q1.add(10);
		q1.add(20);
		q1.add(30);

		System.out.println("Head if quee is: " + q1.element());

		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue");
		}

		for (Integer integer : q1) {
			System.out.println("Queue value: " + integer);
		}
		System.out.println("Removed from queee: " + q1.remove());
		System.out.println("Removed from queee: " + q1.remove());
		System.out.println("Removed from queee: " + q1.remove());
		try {
			System.out.println("Removed from queee: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from quee");
		}
		///////////////////////////////////////
		System.out.println();
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		for (Integer integer : q2) {
			System.out.println("Queue 2 value: " + integer);
		}

		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
	}

}

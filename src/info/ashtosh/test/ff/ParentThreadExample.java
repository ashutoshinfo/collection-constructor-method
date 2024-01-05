package info.ashtosh.test.ff;

public class ParentThreadExample {
	public static void main(String[] args) {
		Thread parentThread = Thread.currentThread();

		// Create a new thread
		Thread childThread = new Thread(() -> {
			// Inside the child thread
			Thread currentThread = Thread.currentThread();
			ThreadGroup threadGroup = currentThread.getThreadGroup();
			ThreadGroup parentThreadGroup = threadGroup.getParent();

			System.out.println("Child Thread Name: " + currentThread.getName());
			System.out.println("Child Thread Group: " + threadGroup.getName());
			System.out.println(
					"Parent Thread Group: " + (parentThreadGroup != null ? parentThreadGroup.getName() : "None"));
		});

		// Start the child thread
		childThread.start();

		// Inside the main thread
		System.out.println("Main Thread Name: " + parentThread.getName());
		System.out.println("Main Thread Group: " + parentThread.getThreadGroup().getName());
		System.out.println("Parent Thread Group: None (Main thread is the top-level thread)");

		// Wait for the child thread to finish
		try {
			childThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

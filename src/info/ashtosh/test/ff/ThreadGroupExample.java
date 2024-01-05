package info.ashtosh.test.ff;

public class ThreadGroupExample {
	public static void main(String[] args) {
		// Create a thread group named "myGroup-1" in the main thread group
		ThreadGroup myGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(), "myGroup-1");

		// Create a thread in the "myGroup-1" group
		Thread myThread = new Thread(myGroup, () -> {
			Thread currentThread = Thread.currentThread();
			ThreadGroup threadGroup = currentThread.getThreadGroup();
			ThreadGroup parentGroup = threadGroup.getParent();
			ThreadGroup parentParentGroup = (parentGroup != null) ? parentGroup.getParent() : null;

			System.out.println("Thread Name: " + currentThread.getName());
			System.out.println("Thread Group: " + threadGroup.getName());
			System.out.println("Thread Group's Parent: " + ((parentGroup != null) ? parentGroup.getName() : "None"));
			System.out.println("Thread Group's Parent's Parent: "
					+ ((parentParentGroup != null) ? parentParentGroup.getName() : "None"));
		});

		// Start the thread
		myThread.start();

		// Wait for the thread to finish
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

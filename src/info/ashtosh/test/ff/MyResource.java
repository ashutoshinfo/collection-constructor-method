package info.ashtosh.test.ff;

public class MyResource implements AutoCloseable {
	// Resource initialization code can go here

	public void performOperation() throws Exception {
		System.out.println("Performing some operation with the resource.");
//		throw new Exception();
	}

	@Override
	public void close() throws Exception {
		// Resource cleanup code can go here
		System.out.println("Closing the resource.");
	}

	public static void main(String[] args) {
		// Using try-with-resources to automatically close the resource
		try (MyResource resource = new MyResource()) {
			// Resource is automatically closed after this block
			resource.performOperation();
			
		} catch (Exception e) {
			// Exception handling if needed
			e.printStackTrace();
		}
	}
}

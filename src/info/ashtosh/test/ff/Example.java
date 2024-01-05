package info.ashtosh.test.ff;

interface SetInterface {
	void print();

}

interface SortedSetInterface extends SetInterface {
	void first();
}

class TreeSetClass implements SortedSetInterface {
	@Override
	public void print() {
		System.out.println("Printing from ExampleClass");
	}

	@Override
	public void first() {
		System.out.println("Sorting from ExampleClass");
	}

	public class Main {
		public static void main(String[] args) {
			SetInterface exampleObject = new TreeSetClass();

			// Calling the print() method inherited from SetInterface
			exampleObject.print();

			// Calling the sort() method declared in SortedSetInterface
//			exampleObject.first();
			SetInterface exampleObject2 = new TreeSetClass();
			if (exampleObject instanceof SortedSetInterface) {
			    SortedSetInterface sortedSetObject = (SortedSetInterface) exampleObject2;
			    sortedSetObject.first(); // Now, you can call the first() method
			}

		}
	}

}

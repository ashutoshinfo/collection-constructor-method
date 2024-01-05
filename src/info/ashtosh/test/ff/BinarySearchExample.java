package info.ashtosh.test.ff;

public class BinarySearchExample {
	public static void main(String[] args) {
		int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 7;

		int result = binarySearch(sortedArray, target);

		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}

	// Binary search function
	static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == target) {
				return mid; // Target found
			} else if (array[mid] < target) {
				low = mid + 1; // Discard the left half
			} else {
				high = mid - 1; // Discard the right half
			}
		}

		return -1; // Target not found
	}
}

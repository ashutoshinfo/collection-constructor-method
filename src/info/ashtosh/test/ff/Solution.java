package info.ashtosh.test.ff;

class Solution {
	public static int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {
				if (!(target == 0 && nums[j] == 0)) {
					indices[0] = i;
				} else {
					if (nums[j] >= target) {
						continue;
					}
				}

				if (nums[i] + nums[j] == target) {
					indices[0] = i;
					if (indices[0] == j) {
						continue;
					}
					indices[1] = j;
				}
			}
		}

		return indices;

	}

	public static void main(String[] args) {
		int[] twoSum = twoSum(new int[] { 0, 4, 3, 0 }, 0);
		for (int i : twoSum) {
			System.out.println(i);

		}
	}

}
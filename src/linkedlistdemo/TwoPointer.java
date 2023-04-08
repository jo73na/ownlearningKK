package linkedlistdemo;

import java.util.Arrays;

public class TwoPointer {
	public static void main(String[] args) {
		int[] arr0 = { 3, 2, 1, 2, 3, 2, 6, 9, 4 }; int[] arr1 = { 3, 2, 1, 2, 3, 2, 6, 9, 4 };
		System.out.println("----------------------uni-------------------");
		int[] ans0 = removeElementUnidirectional(arr0, 3);
		System.out.println(Arrays.toString(ans0));
		System.out.println("---------------------bi--------------------");
		int[] ans2 = removeElementBidirectional(arr1, 3);
		System.out.println(Arrays.toString(ans2));
	}
	public static int[] removeElementUnidirectional(int[] nums, int val) {
		int left = 0; 		int right = 0;
		while (right < nums.length) {
			if (nums[right] != val) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left++] = temp;
			}
			right++;
		}
		return Arrays.copyOf(nums, left);
	}
	public static int[] removeElementBidirectional(int[] nums, int target) {
		int left = 0; 		int right = nums.length - 1;
		while (left <= right) {
			if (nums[left] == target) {
				nums[left] = nums[right];
				right--;
			} else { left++;}
		}
		return Arrays.copyOfRange(nums, 0, left);
	}
}

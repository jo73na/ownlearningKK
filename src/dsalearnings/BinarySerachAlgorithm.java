package dsalearnings;

public class BinarySerachAlgorithm {

	public static int bsa(int[] arr, int target) {
		if (arr.length - 1 == 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// int arr[] = {10,20,30,40,50};
		int arr[] = { 10, 20, 30, 40, 60, 110, 120, 130, 170 };
		//int arr1[][] = {{1,3}};
		int target = 110;
		int ans = bsa(arr, target);
		System.out.println(ans);
	}

}

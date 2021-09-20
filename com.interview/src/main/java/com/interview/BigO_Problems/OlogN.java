package com.interview.BigO_Problems;

public class OlogN {

	int OlogN(int arr[], int l, int r, int x) {

		if (r >= l) {

			int mid = l + (r - l) / 2;

			if (arr[mid] == x)

				return mid;
			if (arr[mid] > x)

				return OlogN(arr, l, mid - 1, x);

			return OlogN(arr, mid + 1, r, x);

		}
		return -1;

	}

	public static void main(String[] args) {

		// Note: In O(log n) number of steps increases as the Size of elements
		// increases.

		OlogN obj = new OlogN();

		int arr[] = { 1, 2, 10, 40, 6 };

		int n = arr.length;

		int x = 10;

		int result = obj.OlogN(arr, 0, n - 1, x);

		System.out.println("Element found at index " + result);

	}

}

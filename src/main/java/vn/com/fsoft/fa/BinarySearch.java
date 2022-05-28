package vn.com.fsoft.fa;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 14, 40, 41, 44, 47, 50 };
		int n = arr.length;
		int x = 15;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1) {
			System.out.println(x + " Khong ton tai trong mang ");
		} else {
			System.out.println(x + " xuat hien tai chi so " + result);
		}
	}

	private static int binarySearch(int arr[], int l, int r, int x) {
		System.out.println("l = " + l + ", r = " + r);
		if (r >= l) {
			int mid = l + (r - l) / 2;
			showArray(arr, l, r, mid, x);
			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, r, x);
			}
		}
		return -1;
	}

	private static void showArray(int arr[], int l, int r, int mid, int x) {
		System.out.print("l = " + l + ", r = " + r + ", mid = " + mid + ", arr[" + mid + "] = " + arr[mid] + ",x = " + x
				+ ", arr = ");
		int[] copyOfRange = Arrays.copyOfRange(arr, l, r + 1);
		System.out.println(Arrays.toString(copyOfRange));
	}
}

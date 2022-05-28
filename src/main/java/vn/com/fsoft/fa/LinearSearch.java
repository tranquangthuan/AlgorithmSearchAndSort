package vn.com.fsoft.fa;

/**
 * Hello world!
 *
 */
public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 14;
		int result = search(arr, x);
		if (result == -1) {
			System.out.println(x + " Khong ton tai trong mang ");
		} else {
			System.out.println(x + " xuat hien tai chi so " + result);
		}
	}

	public static int search(int arr[], int x) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}

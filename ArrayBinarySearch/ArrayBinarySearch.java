package ArrayBinarySearch;

import java.util.Scanner;

class ArrayBinarySearch{
	public int binarySearch(int arr[], int l, int r, int x)
	{
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				r = mid - 1;
			} else {
			l = mid + 1;
			} 
		}
		return -1;
	}

	public static void main(String args[])
	{
		ArrayBinarySearch ob = new ArrayBinarySearch();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int m = s.nextInt();
		int[] arr = new int[m];
        System.out.println("enter the array values:");

        for(int i = 0; i<m; i++){
            arr[i] = s.nextInt();
        }
		int n = arr.length;
        System.out.println("enter the search element:");
		int x = s.nextInt();
		int result = ob.binarySearch(arr, 0, n - 1, x);
        s.close();

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index:"+ result);
	}
}


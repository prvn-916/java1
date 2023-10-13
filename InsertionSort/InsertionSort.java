package InsertionSort;
import java.util.Scanner;

public class InsertionSort { 
	public void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int key = arr[i]; 
			int j = i - 1; 
			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 

	public static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = s.nextInt();
		int arr[] = new int[n] ;
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n ; i++){
            arr[i] = s.nextInt();
        }

		InsertionSort ob = new InsertionSort(); 
		ob.sort(arr); 
        s.close();
		printArray(arr); 
	} 
}

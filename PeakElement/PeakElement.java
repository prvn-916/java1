package PeakElement;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int peakIndex = findPeakIndex(arr);
        System.out.println(peakIndex);
        scanner.close();
    }

    static int findPeakIndex(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        return -1; 
        
    }
}

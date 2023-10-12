package BubbleSort;

import java.util.Scanner;

class BubbleSort {
    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = s.nextInt();
        int[] arr = new int[len];
        s.close();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }

        ob.bubbleSort(arr);
        System.out.println("Sorted array:");
        ob.printArray(arr);
    }
}


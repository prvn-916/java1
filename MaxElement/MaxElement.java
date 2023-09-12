import java.util.Scanner;

public class MaxElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        

        printElementsGreaterThanLeft(arr);
    }

    static void printElementsGreaterThanLeft(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSoFar) {
                System.out.print(arr[i] + " ");
                maxSoFar = arr[i];
            }
        }
    }
}

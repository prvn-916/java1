package ArrayXor;
import java.util.Scanner;

public class ArrayXor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int k = 0; k < t ; k++) {
            int n = scanner.nextInt(); 
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            long result = 0; 

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    result += (arr[i] ^ arr[j])*2;
                }
            }

            System.out.println(result);
        }
        scanner.close();
    }
}

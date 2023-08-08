package pattern6;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for (i = n - 1; i >= 1; i--) {
            for (j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}



import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int i,j;
        for ( i = 1; i <= n; i++) {
            for ( j = 0; j <= n - i; j++) {
                
            }
            int x = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}

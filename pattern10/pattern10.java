

import java.util.Scanner;

public class pattern10 {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n ; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j <i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}

package pattern8;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n ; j++){
                if(i == j || i+j == n-1)
                System.out.print("$ ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

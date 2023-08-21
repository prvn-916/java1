package turnOffBit;

import java.util.Scanner;

public class turnOffBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 1 ; i<= t; i++){
            int n = s.nextInt();
            System.out.println( n - (n & (-n)));
        }
        s.close();
    }
    
}

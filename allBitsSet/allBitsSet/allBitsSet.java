package allBitsSet;

import java.util.Scanner;

public class allBitsSet {
    public static void main(String[] args) {
        
    
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        for(int i = 1; i<= k ; i++)
        {
            int n = s.nextInt();
            if(n == 0)
            System.out.println("NO");
            if((n & (n+1)) == 0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        s.close();
    }    
} 

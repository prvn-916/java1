

import java.util.Scanner;

public class toggleBit {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        for(long i = 0 ; i<t; i++){
            long n = s.nextLong();
            long p = s.nextLong();
            long mask =  (1 << (p-1));
            long k =  (n ^ mask);
            System.out.println(k);
        }
    }
    
}

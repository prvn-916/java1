package NiceDivisors;

import java.util.Scanner;

public class NiceDivisors {
    
        public int maxNiceDivisors(int primeFactors) {
            if (primeFactors <= 3) {
                return primeFactors;
            }
    
            long MOD = 1_000_000_007;
            int maxThrees = primeFactors / 3;
            
            if (primeFactors % 3 == 1) {
                maxThrees -= 1;
            }
            
            int numTwos = (primeFactors - 3 * maxThrees) / 2;
            
            long result = 1;
            long base = 3;
            while (maxThrees > 0) {
                if (maxThrees % 2 == 1) {
                    result = (result * base) % MOD;
                }
                base = (base * base) % MOD;
                maxThrees /= 2;
            }
            
            while (numTwos > 0) {
                result = (result * 2) % MOD;
                numTwos--;
            }
            
            return (int) result;
        }
    
     public static void main(String[] args) {
        NiceDivisors NiceDivisors = new NiceDivisors();
        Scanner s = new Scanner(System.in);
        int primeFactors = s.nextInt();
        System.out.println(NiceDivisors.maxNiceDivisors(primeFactors));
        s.close();
     }    
    
}

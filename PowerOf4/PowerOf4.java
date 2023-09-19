package PowerOf4;

import java.util.Scanner;

class PowerOf4 {
    public boolean isPowerOfFour(int n) {
   if (n <= 0) {
            return false;
        }
        double logValue = Math.log(n) / Math.log(4);
        return logValue == (int) logValue;
    }    
        public static void main(String[] args) {
            PowerOf4 PowerOf4 = new PowerOf4();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            s.close();
            System.out.println(PowerOf4.isPowerOfFour(n));
        }   
}
package PowerOfTwo;

import java.util.Scanner;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
       
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo PowerOfTwo = new PowerOfTwo();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        
        System.out.println(PowerOfTwo.isPowerOfTwo(n));
    }
}


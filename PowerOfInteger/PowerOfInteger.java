package PowerOfInteger;

import java.util.Scanner;

public class PowerOfInteger {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        if (n % 2 == 0) {
            double temp = myPow(x * x, n / 2);
            return temp;
        } else {
        
            double temp = myPow(x * x, (n - 1) / 2);
            return x * temp;
        }
    }

    public static void main(String[] args) {
        PowerOfInteger PowerOfInteger = new PowerOfInteger();
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        int n = s.nextInt();
        s.close();
       
        System.out.println( PowerOfInteger.myPow(x, n));
    }
}


package PowerOf3;

import java.util.Scanner;

public class PowerOf3 {
    public boolean isPowerOf3(int n) {
        if (n <= 0) {
            return false;
        }
        double logResult = Math.log10(n) / Math.log10(3);
        return logResult % 1 == 0;
    }

    public static void main(String[] args) {
        PowerOf3 PowerOf3 = new PowerOf3();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(PowerOf3.isPowerOf3(n));
    }
}

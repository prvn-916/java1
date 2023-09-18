package RecursiveFib;

import java.util.Scanner;

public class RecursiveFib {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        RecursiveFib RecursiveFib = new RecursiveFib();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(RecursiveFib.fib(n));
    }
}
